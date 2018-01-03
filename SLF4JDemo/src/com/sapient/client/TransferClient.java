package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.service.Iser;
import com.sapient.service.SerImpl;

public class TransferClient {

	private static Logger logger= LoggerFactory.getLogger("sapient"); 
	
	public static void main(String[] args) throws IdException {
		logger.trace("main thread starts");
		
		Iser ser = new SerImpl(); 
		
		logger.debug("service instance created");
		
		try {
			logger.info("transfer the amount Rs.5000 from Acc1001 to Acc1002");
			ser.transferFund(1001, 1002, 5000);
			logger.info("successfully transferred 5000");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		} 
	
		try {
			logger.info("transfer the amount Rs.500 from Acc1003 to Acc1002");
			ser.transferFund(1003, 1002, 500);
			logger.info("successfully transferred 5000");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		}
	
		try {
			logger.info("transfer the amount Rs.500 from Acc2003 to Acc1002");
			ser.transferFund(2003, 1002, 500);
			logger.info("successfully transferred 5000");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		}
	}

}
