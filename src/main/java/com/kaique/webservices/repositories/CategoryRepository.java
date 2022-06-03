package com.kaique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
