package com.habile.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habile.backend.model.User;

public interface UserRepository extends JpaRepository<User,String>{

}
