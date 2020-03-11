package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.Product;
import com.capg.demo.service.IProductService;

@RestController
//@Controller+@ResponseBody
@RequestMapping("/product/api/v1")
public class ProductRestController {
	
	@Autowired
	private IProductService productService;
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		
		List<Product> products= productService.getAllProducts();
		if(products.isEmpty()) {
			return new ResponseEntity("Sorry! products not available.", HttpStatus.NOT_FOUND);
		}
		
		
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		
	}

	
	
	@RequestMapping("/greet")
	public String sayHello() {
		return "Hello World!";
	}
}
