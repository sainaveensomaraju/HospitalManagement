package com.hospital.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.bean.Admin;
import com.hospital.bean.Patient;
import com.hospital.bean.Roles;
import com.hospital.services.AdminServices;
import com.hospital.services.RoleServices;
@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:4200")
public class RolesController {
	@Autowired
	private RoleServices service;
	
	@Autowired
	private AdminServices adminService;
	
	@PostMapping("/add")
	public Roles add(@RequestBody Roles role) {
		return this.service.addRole(role);
	}
	
	@GetMapping("/get/{id}")
	public Roles getById(@PathVariable(name="id")int id) {
		return this.service.getRoleById(id);
	}
	
	@GetMapping("/get")
	public List<Roles> getAllRoles(){
		return this.service.getAllRoles();
	}
	
	@GetMapping("/{name}")
	public Roles get(@PathVariable(name="name")String name) {
		return this.service.getRolesByName(name);
	}
	
	public static boolean validateUser(List<Admin>allAdmin,String [] credentials) {

		for (Admin admin : allAdmin) {
			if (admin.getUserName().equalsIgnoreCase(credentials[0])) {

				if (admin.getPassword().equalsIgnoreCase(credentials[1])) {
					return true;
				}

			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/{role}/{key}")
	public boolean ValidateAdmin(@PathVariable(name="role") int role,@PathVariable(name = "key") String data) {
		System.out.println("skdjhkajf");
		String[] credentials = data.split("&");
		if(role==1) {
			List<Admin> allAdmin = new ArrayList<>();
			allAdmin=this.adminService.getAll();
			
			return validateUser(allAdmin,credentials);
		}
//		else if(role==2) {
//			List<Patient> pathien=new ArrayList<Patient>();
//		}
		return false;
	}
}
