package com.kaique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
