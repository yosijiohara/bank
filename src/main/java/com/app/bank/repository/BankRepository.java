package com.app.bank.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bank.entity.BankEntity;
@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer> {}