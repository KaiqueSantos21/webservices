package com.kaique.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
