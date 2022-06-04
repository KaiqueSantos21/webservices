package com.kaique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
