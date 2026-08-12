package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
