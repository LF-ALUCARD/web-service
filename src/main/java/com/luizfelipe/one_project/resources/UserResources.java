package com.luizfelipe.one_project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizfelipe.one_project.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Luiz Felipe", "luiz@gmail.com", "999999999", "156385");
		return ResponseEntity.ok().body(u);
	}
}
