package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String userName);

	public boolean existsByEmail(String email);

	public boolean existsByUsername(String username);

}
