package com.hospital.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Disease [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
	public Disease(int id, String name, int level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
	}
	public Disease() {
		super();
	}
	
	

}
