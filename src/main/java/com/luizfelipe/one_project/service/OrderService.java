package com.luizfelipe.one_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizfelipe.one_project.entities.Order;
import com.luizfelipe.one_project.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		
		List<Order> list = orderRepository.findAll();
		
		return list;
	}

	public Order findById(Long Id) {

		Optional<Order> obj = orderRepository.findById(Id);
		return obj.get();
	}
}
