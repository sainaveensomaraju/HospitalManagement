package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.bean.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
public Admin findByUserName(String name);
}
