package com.hospital.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double testReading;
	private String condition;
	@Embedded
	Appointment appointment;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public double getTestReading() {
	return testReading;
	}
	public void setTestReading(double testReading) {
	this.testReading = testReading;
	}
	public String getCondition() {
	return condition;
	}
	public void setCondition(String condition) {
	this.condition = condition;
	}
	public Appointment getAppointment() {
	return appointment;
	}
	public void setAppointment(Appointment appointment) {
	this.appointment = appointment;
	}
	public TestResult(int id, double testReading, String condition, Appointment appointment) {
	super();
	this.id = id;
	this.testReading = testReading;
	this.condition = condition;
	this.appointment = appointment;
	}
	public TestResult() {
	super();
	}
	@Override
	public String toString() {
	return "TestResult [id=" + id + ", testReading=" + testReading + ", condition=" + condition + ", appointment="
	+ appointment + "]";
	}

}
