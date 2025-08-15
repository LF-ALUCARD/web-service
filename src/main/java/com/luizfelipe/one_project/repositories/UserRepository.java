package com.luizfelipe.one_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizfelipe.one_project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
