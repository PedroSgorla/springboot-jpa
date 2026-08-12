package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
