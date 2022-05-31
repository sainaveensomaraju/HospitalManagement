package com.hospital.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ApproveStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String stauts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStauts() {
		return stauts;
	}
	public void setStauts(String stauts) {
		this.stauts = stauts;
	}
	@Override
	public String toString() {
		return "ApproveStatus [id=" + id + ", stauts=" + stauts + "]";
	}
	public ApproveStatus(int id, String stauts) {
		super();
		this.id = id;
		this.stauts = stauts;
	}
	public ApproveStatus() {
		super();
	}
	
}
