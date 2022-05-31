package com.hospital.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class DiagnosticCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contactNo;
	private String address;
	private String email;
	@ManyToMany
	@JoinTable(
			name="availableInCenters",
			joinColumns = @JoinColumn(name="center_Id"),
			inverseJoinColumns = @JoinColumn(name="test_Id")
			)
	private List<DiagnosticTest> availbaleTests;
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<DiagnosticTest> getAvailbaleTests() {
		return availbaleTests;
	}
	public void setAvailbaleTests(List<DiagnosticTest> availbaleTests) {
		this.availbaleTests = availbaleTests;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", email=" + email + ", availbaleTests=" + availbaleTests + "]";
	}
	public DiagnosticCenter(int id, String name, String contactNo, String address, String email,
			List<DiagnosticTest> availbaleTests) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
		this.availbaleTests = availbaleTests;
	}
	public DiagnosticCenter() {
		super();
	}
	public DiagnosticCenter(int id) {
		super();
		this.id = id;
	}
	
	
	
}
