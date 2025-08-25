package com.luizfelipe.one_project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizfelipe.one_project.entities.Product;
import com.luizfelipe.one_project.service.ProductService;

@RestController
@RequestMapping(value = "/produtos")
public class ProductResources {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> list = productService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Product> findById(@PathVariable Long Id){
		
		Product obj = productService.findById(Id);
		
		return ResponseEntity.ok().body(obj); 
	}
}
