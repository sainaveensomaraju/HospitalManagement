package com.hospital.bean;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public  int id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String phoneNumber;
	private int age;
	private String address;
	private String history;
	@Embedded
	private List<Appointment> allAppointments;

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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public List<Appointment> getAllAppointments() {
		return allAppointments;
	}

	public void setAllAppointments(List<Appointment> allAppointments) {
		this.allAppointments = allAppointments;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", age=" + age + ", address=" + address + ", history=" + history
				+ ", allAppointments=" + allAppointments+"]";
	}

	public Patient(int id, String firstName, String lastName, Gender gender, String phoneNumber, int age,List<Appointment> allAppointments,
			String address, String history) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
		this.history = history;
		this.allAppointments = allAppointments;
	}

	public Patient() {
		super();
	}

	public Patient(int id) {
		super();
		this.id = id;
	}
	
	
	

}
