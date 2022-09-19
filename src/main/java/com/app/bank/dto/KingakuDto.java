package com.app.bank.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor // 引数0のコンストラクタ
@AllArgsConstructor // 引数全部のコンストラクタ
public class KingakuDto {
    String kingaku; // 入力金額
}
