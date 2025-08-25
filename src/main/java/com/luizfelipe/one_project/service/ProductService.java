package com.luizfelipe.one_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizfelipe.one_project.entities.Product;
import com.luizfelipe.one_project.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		
		List<Product> list = productRepository.findAll();
		return list;
	}
	
	public Product findById(Long Id) {
		
		Optional<Product> obj = productRepository.findById(Id);
		return obj.get();
	}
}
