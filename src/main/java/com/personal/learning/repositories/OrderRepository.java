package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
