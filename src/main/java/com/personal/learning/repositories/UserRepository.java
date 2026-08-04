package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
