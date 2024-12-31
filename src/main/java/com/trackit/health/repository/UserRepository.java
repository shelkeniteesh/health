package com.trackit.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trackit.health.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
      
}
