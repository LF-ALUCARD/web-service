package com.luizfelipe.one_project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizfelipe.one_project.entities.Category;
import com.luizfelipe.one_project.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		
		List<Category> list = categoryService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Category> findById(@PathVariable Long Id){
		
		Category obj = categoryService.findById(Id);
		
		return ResponseEntity.ok().body(obj); 
	}
}
