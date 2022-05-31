package com.hospital.serviceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.bean.Admin;
import com.hospital.repository.AdminRepository;
import com.hospital.services.AdminServices;
@Service
public class AdminServiceImplimentation implements AdminServices {
	@Autowired
	private AdminRepository repository;
	@Override
	public Admin addAdmin(Admin admin) {
		
		return this.repository.save(admin);
	}

	@Override
	public boolean validate(String key) {
		return false;
	}

	@Override
	public Admin editAdmin(Admin admin) {
		
		return null;
	}

	@Override
	public List<Admin> getAll() {
		
		return this.repository.findAll();
	}

	@Override
	public Admin getById(int id) {
		Optional<Admin>opt= this.repository.findById(id);
		if(opt.isPresent())
			return opt.get();
		return null;
	}

	@Override
	public Admin findByUserName(String username) {
		return this.repository.findByUserName(username);
	}

}
