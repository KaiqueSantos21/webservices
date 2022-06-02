package com.kaique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
