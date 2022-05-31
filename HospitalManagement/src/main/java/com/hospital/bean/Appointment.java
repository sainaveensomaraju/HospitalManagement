package com.hospital.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


@Embeddable
public class Appointment {
	@Column(name="appointment_id")
	public int id;
	@Transient
	private LocalDate appointmentDate;
	@Transient
	private ApproveStatus approveStatus;
	@Transient
	@OneToMany(targetEntity = DiagnosticTest.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "All_test_fk", referencedColumnName = "id")
	private List<DiagnosticTest> tests;
	@Transient
	private Patient patient;
	@Transient
	private DiagnosticCenter center;
	@Transient
	@OneToMany(targetEntity = TestResult.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "All_test_fk", referencedColumnName = "id")
	private List<TestResult> testResults;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public ApproveStatus getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(ApproveStatus approveStatus) {
		this.approveStatus = approveStatus;
	}

	public List<DiagnosticTest> getTests() {
		return tests;
	}

	public void setTests(List<DiagnosticTest> tests) {
		this.tests = tests;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public DiagnosticCenter getCenter() {
		return center;
	}

	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}

	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentDate=" + appointmentDate + ", approveStatus=" + approveStatus
				+ ", tests=" + tests + ", patient=" + patient + ", center=" + center + ", testResults=" + testResults
				+ "]";
	}

	public Appointment(int id, LocalDate appointmentDate, ApproveStatus approveStatus, List<DiagnosticTest> tests,
			Patient patient, DiagnosticCenter center, List<TestResult> testResults) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.approveStatus = approveStatus;
		this.tests = tests;
		this.patient = patient;
		this.center = center;
		this.testResults = testResults;
	}

	public Appointment() {
		super();
	}

	public Appointment(int id) {
		super();
		this.id = id;
	}
	
	

}
