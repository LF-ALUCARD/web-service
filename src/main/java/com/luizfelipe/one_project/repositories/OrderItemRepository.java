package com.luizfelipe.one_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfelipe.one_project.entities.OrderItem;
import com.luizfelipe.one_project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
