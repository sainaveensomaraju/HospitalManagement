package com.hospital.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String  lastName;
	private int age;
	private String phoneNumber;
	private Gender gender;
	private String userName;
	private String password;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", userName=" + userName + ", password="
				+ password + ", salary=" + salary + "]";
	}
	
	public Admin(int id, String firstName, String lastName, int age, String phoneNumber, Gender gender, String userName,
			String password, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.salary = salary;
	}
	public Admin() {
		super();
	}
	public Admin(int id) {
		super();
		this.id = id;
	}
	
	

}
