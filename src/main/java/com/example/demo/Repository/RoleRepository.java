package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Role;
import com.example.demo.Model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(RoleName roleAdmin);

}
