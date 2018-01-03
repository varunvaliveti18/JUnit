package com.sapient.dao;

import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public interface IDao {

	public Account getAccount(int eid) throws IdException;
}
