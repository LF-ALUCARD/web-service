package com.luizfelipe.one_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizfelipe.one_project.entities.Category;
import com.luizfelipe.one_project.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAll() {
		
		List<Category> list = categoryRepository.findAll();
		
		return list;
	}

	public Category findById(Long Id) {

		Optional<Category> obj = categoryRepository.findById(Id);
		return obj.get();
	}
}
