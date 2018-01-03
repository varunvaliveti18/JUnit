package com.sapient.service;

import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class SerImpl implements Iser{
	
	private IDao dao;

	public void setDao(IDao dao) {
		System.out.println("injecting mock");
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalException, IdException {
		Account from = dao.getAccount(fid);
		System.out.println(from);
		Account to = dao.getAccount(tid);
		System.out.println(to);
		if(from.getBal() < amt)
			throw new BalException("no suficient fund to transfer");
		from.setBal(from.getBal() - amt);
		to.setBal(to.getBal() + amt);
		return true;
	}
	
	

}
