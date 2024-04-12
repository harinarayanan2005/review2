
package com.example.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.review.model.User;

public interface UserRepository extends JpaRepository<User,String> {
    
} 