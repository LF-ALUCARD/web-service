package com.luizfelipe.one_project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizfelipe.one_project.entities.Order;
import com.luizfelipe.one_project.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	
	@Autowired
	private OrderService OrderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> list = OrderService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{Id}")
	public ResponseEntity<Order> findById(@PathVariable Long Id){
		
		Order obj = OrderService.findById(Id);
		
		return ResponseEntity.ok().body(obj); 
	}
}
