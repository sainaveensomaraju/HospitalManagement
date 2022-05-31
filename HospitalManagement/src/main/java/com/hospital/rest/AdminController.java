package com.hospital.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.bean.Admin;

import com.hospital.serviceImplementation.AdminServiceImplimentation;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminServiceImplimentation adminServices;

	@PostMapping("/add")
	public Admin addAdmin(@RequestBody Admin admin) {
		return this.adminServices.addAdmin(admin);
	}
	
	@GetMapping("/getAll")
	public List<Admin> getAll(){
		return this.adminServices.getAll();
	}
	
	@GetMapping("/get")
	public List<Admin> getAll(@PathVariable(name="id")int id) {
		return this.adminServices.getAll();
	}
	
	@GetMapping("/{id}")
	public Admin getById(@PathVariable(name="id")int id) {
		return this.adminServices.getById(id);
	}
	
	
	
}

