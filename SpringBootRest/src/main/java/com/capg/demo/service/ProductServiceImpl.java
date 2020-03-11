package com.capg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.dao.IProductDao;
import com.capg.demo.model.Product;
@Service("productService")
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		
		return productDao.getAllProducts();
	}

}
