package com.luizfelipe.one_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfelipe.one_project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
