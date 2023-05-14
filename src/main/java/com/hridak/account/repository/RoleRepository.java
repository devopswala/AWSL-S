package com.hridak.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hridak.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
