package com.capg.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.capg.demo.model.Product;

@Repository("productDao")
public class ProductDaoImpl implements IProductDao{
	
	private static AtomicInteger productId=new AtomicInteger(10000);
	private static List<Product> products=dummyDB();
	
	private static List<Product> dummyDB(){
		List<Product> products=new ArrayList<>();
		products.add(new Product(productId.incrementAndGet(), "Sony Xperia", 12, 23000, new Date(2001-1900, 3, 12)));
		products.add(new Product(productId.incrementAndGet(), "IPhone xs", 2, 123000, new Date(2091-1900, 5, 2)));
		products.add(new Product(productId.incrementAndGet(), "Samsung", 5, 43543, new Date(2001-1900, 3, 12)));
		products.add(new Product(productId.incrementAndGet(), "IPhone X", 1, 456345, new Date(2011-1900, 3, 12)));
		products.add(new Product(productId.incrementAndGet(), "Honour XS", 6, 12000, new Date(2021-1900, 3, 12)));
		products.add(new Product(productId.incrementAndGet(), "Honour XS Plus", 9, 15000, new Date()));
		return products;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return products;
	}

}
