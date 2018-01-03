package com.sapient.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class DaoImpl implements IDao {
	private static Map<Integer, Account> amap;
	private static Logger logger= LoggerFactory.getLogger("sapient"); 
	
	static{
		
		logger.trace("static block called in dao");
		
		amap = new HashMap<Integer, Account>();
		amap.put(1001, new Account(1001,"ram",10000));
		amap.put(1001, new Account(1002,"tom",5000));
		amap.put(1001, new Account(1003,"sam",3000));
		
		logger.debug("HashMap initialized with 3 account instances");
	}

	@Override
	public Account getAccount(int eid) throws IdException {
		logger.trace("getAccount() method invoked");
		logger.debug("checking the eid against map key ");
		if(!amap.containsKey(eid)) 
			throw new IdException("No ID Found");
		logger.info("account ID {} found",eid);
		return amap.get(eid);
	}

}
