package com.app.bank;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.bank.entity.BankEntity;
import com.app.bank.repository.BankRepository;
import com.app.bank.service.BankService;

@Controller
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@Autowired
	BankRepository bankRepository;
	
 //   @PostMapping(value="/", params="input" )
    @PostMapping("/kingaku" )
    public String input(int kingaku,String inout){ // パラメータ
    	
        System.out.println(inout);        
        
       bankRepository.save(GetBank(kingaku,inout));
        return "redirect:/"; // リダイレクトで"/"に戻る
    }
    
//    @PostMapping(value="/", params="output")
//    public String output(KingakuDto kingaku){ // パラメータ
//        System.out.println(kingaku.getKingaku());
//        System.out.println("出金テスト");
//        return "redirect:/"; // リダイレクトで"/"に戻る
//    }
//      
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", "Hello Springboot");
        
      // 入出金データの取得
      List<BankEntity> bankDataList = bankService.findAllBankData();
      model.addAttribute("bankDataList", bankDataList);
        
        return "nyusyukin";
    }
    
    /**
     * 入出金情報を取得する
     * @param kingaku ユーザ入力金額
     * @param inout 入金or出金
     * @return エンティティ
     */
    private BankEntity GetBank(int kingaku,String inout) {
    	
    	LocalDateTime now = LocalDateTime.now();

    	BankEntity entity = new BankEntity();
    	entity.setUser_id(2);
    	entity.setTransaction_type(inout);
    	entity.setTransaction_amount(kingaku);
    	entity.setDate(now);
    	
        return entity;
    }
}