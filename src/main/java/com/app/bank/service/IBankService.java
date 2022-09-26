package com.app.bank.service;

import java.util.List;

public interface IBankService <T>{
	  /**
	   * レコードを全件取得する。
	   * @return
	   */
	  public List<T> findAllBankData();
}
