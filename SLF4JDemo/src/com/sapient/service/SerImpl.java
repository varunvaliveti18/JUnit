package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class SerImpl implements Iser{
	
	private IDao dao;
	private static Logger logger= LoggerFactory.getLogger("sapient"); 
	
	
	
	public SerImpl() {
		logger.trace("service constructor invoked");
		setDao(new DaoImpl());
		logger.info("service instance is           ");
	}

	public void setDao(IDao dao) {
		logger.trace("setter setDao() invoked");
		logger.debug("injecting dao");
		System.out.println("injecting mock");
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalException, IdException {
		logger.trace("transferfund() invoked in service");
		Account from = dao.getAccount(fid);
		logger.debug("From account retrieved");
		System.out.println(from);
		Account to = dao.getAccount(tid);
		logger.debug("To account retrieved");
		System.out.println(to);
		if(from.getBal() < amt)
			throw new BalException("no suficient fund to transfer");
		from.setBal(from.getBal() - amt);
		to.setBal(to.getBal() + amt);
		logger.info("{} and {} accounts are updated successfully",fid,tid);
		return true;
	}
	
	

}
