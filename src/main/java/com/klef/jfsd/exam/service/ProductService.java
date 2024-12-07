package com.klef.jfsd.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.klef.jfsd.exam.Entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private RestTemplate rest;
	
	
	public List<Product> getAllProducts() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://fakestoreapi.com/products");
        ResponseEntity<List<Product>> response = rest.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Product>>() {}
        );
        return response.getBody();
    }

}
