package com.hospital.services;

import java.util.List;

import com.hospital.bean.Roles;

public interface RoleServices {
	
	public Roles addRole(Roles role);
	
	public Roles getRoleById(int id);
	
	public List<Roles> getAllRoles();
	
	public Roles getRolesByName(String name);
	
}
