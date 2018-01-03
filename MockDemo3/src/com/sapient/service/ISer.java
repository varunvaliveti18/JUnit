package com.sapient.service;

import com.sapient.vo.Product;

public interface ISer {

	Product getProductInfo(String cat,int pid) throws NotFoundException;
}
