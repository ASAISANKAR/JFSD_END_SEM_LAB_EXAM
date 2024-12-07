package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.Entity.Product;
import com.klef.jfsd.exam.service.ProductService;

@RestController
public class ProductsController {
	
	@Autowired
	ProductService ser;
	
	@GetMapping("/getproducts")
	public List<Product> getProducts()
	{
		return ser.getAllProducts();
	}
	
	

}
