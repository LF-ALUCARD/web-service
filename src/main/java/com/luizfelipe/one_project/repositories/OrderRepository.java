package com.luizfelipe.one_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfelipe.one_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
