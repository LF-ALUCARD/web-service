package com.luizfelipe.one_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.luizfelipe.one_project.entities.User;
import com.luizfelipe.one_project.repositories.UserRepository;
import com.luizfelipe.one_project.service.exceptions.DataBaseException;
import com.luizfelipe.one_project.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {

		List<User> list = userRepository.findAll();
		return list;
	}

	public User findById(Long Id) {

		Optional<User> obj = userRepository.findById(Id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
	}
	
	public User insert (User obj) {
		return userRepository.save(obj);
	}
	
	public void delete (Long id) {

		if (!userRepository.existsById(id)) {
		    throw new ResourceNotFoundException(id);
		}
		try {
		userRepository.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {

		try {
			User entity = userRepository.getReferenceById(id);
			updateDate(entity, obj);
			return userRepository.save(entity);
		}
		catch (EntityNotFoundException e){
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateDate(User entity, User obj) {		
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
