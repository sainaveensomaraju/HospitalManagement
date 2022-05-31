package com.hospital.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Roles {
	@Id
	private int id;
	@Column
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", role=" + role + "]";
	}

	public Roles(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public Roles() {
		super();
	}
	
	
	
}
