package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.bean.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles,Integer> {
	public Roles findByRole(String name);

}
