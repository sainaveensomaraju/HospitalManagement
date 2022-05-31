package com.hospital.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Roles;
import com.hospital.repository.RoleRepository;
import com.hospital.services.RoleServices;
@Service
public class RolesServiceImpl implements RoleServices {
	@Autowired
	private RoleRepository repo;

	@Override
	public Roles addRole(Roles role) {
		return this.repo.save(role);
	}

	@Override
	public Roles getRoleById(int id) {
	Optional<Roles>optional= this.repo.findById(id);
	if(optional.isPresent()) {return optional.get();}
	return null;
	}

	@Override
	public List<Roles> getAllRoles() {
		return this.repo.findAll();
	}

	@Override
	public Roles getRolesByName(String name) {
		return this.repo.findByRole(name);
	}

}
