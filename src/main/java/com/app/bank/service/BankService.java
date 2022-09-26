package com.app.bank.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bank.entity.BankEntity;
import com.app.bank.repository.BankRepository;
@Service
@Transactional
public class BankService implements IBankService<BankEntity>{

  @Autowired
  BankRepository bankRepository;

  /**
   * レコードを全件取得する。
   * @return
   */
  public List<BankEntity> findAllBankData(){

    return bankRepository.findAll();
  }
}