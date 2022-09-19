package com.app.bank.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 リクエストデータ
 */
@Data

public class NyusyukinRequest implements Serializable {
    /**
     * ユーザーID
     */
    private Integer user_id;
    /**
     * 取引番号
     */
    private Integer transaction_number;
    /**
     * 取引種別
     */
    private String transaction_type;
    /**
     * 取引金額
     */
    private Integer transaction_amount;
    
}