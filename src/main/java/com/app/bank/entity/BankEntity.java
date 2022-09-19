package com.app.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Getter
@Setter
@Table(name="transaction2")
public class BankEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer transaction_number;
    
    private Integer user_id;
    
    private String transaction_type;

    private Integer transaction_amount;
    
    private LocalDateTime date;
}