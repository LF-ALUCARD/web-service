package com.luizfelipe.one_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfelipe.one_project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
