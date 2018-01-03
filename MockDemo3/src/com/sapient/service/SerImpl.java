package com.sapient.service;

import java.util.List;
import java.util.Map;

import com.sapient.dao.IProductDao;
import com.sapient.vo.Product;

public class SerImpl implements ISer{

	private IProductDao dao;

	//setter is used by mockito to inject mock instance
	public void setDao(IProductDao dao) {
		this.dao = dao;
	}


	@Override
	public Product getProductInfo(String cat, int pid) throws NotFoundException {
		
		Map<String,Map<Integer,Product>> catMap = dao.getCatNProds();
		Map<Integer, Product> pmap = catMap.get(cat);
		
		if(!pmap.containsKey(pid)) 
			throw new NotFoundException("Product id not found");
		
		Product prod = pmap.get(pid);
		List<String> specList = dao.getProductSpecs(prod.getProdName());
		prod.setSpecList(specList);
		return prod;
	}
	

}
