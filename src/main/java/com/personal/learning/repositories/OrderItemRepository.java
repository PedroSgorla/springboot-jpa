package com.personal.learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.learning.entities.OrderItem;
import com.personal.learning.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
