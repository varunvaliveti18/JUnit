package com.sapient.service;

import java.util.List;

import com.sapient.dao.Idao;
import com.sapient.vo.Emp;

public class SerImpl implements Iser{

	private Idao dao;
	
	
	
	public void setDao(Idao dao) {
		this.dao = dao;
	}



	@Override
	public List<Emp> viewEmployee(String order) {
		List<Emp> lst = dao.getEmployee();
		if(order.equals("id")){
			lst.sort((e1,e2)-> ((Integer)e1.getEid()).compareTo((Integer)e2.getEid()));
		}else if(order.equals("name")){
			lst.sort((e1,e2)-> (e1.getEname()).compareTo(e2.getEname()));
		}else if(order.equals("sal")){
			lst.sort((e1,e2)-> ((Double)e1.getSal()).compareTo((Double)e2.getSal()));
		}else{
		return null;
	}
		return lst;
	}
}
