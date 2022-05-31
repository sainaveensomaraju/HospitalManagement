package com.hospital.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.bean.Admin;

@Service
public interface AdminServices {
	
	public Admin addAdmin(Admin admin);
	
	public boolean validate(String key);
	
	public Admin editAdmin(Admin admin);
	
	
	public List<Admin> getAll();
	
	public Admin getById(int id);
	
	public Admin findByUserName(String username);
	
	

}
