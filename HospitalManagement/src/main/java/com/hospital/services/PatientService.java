package com.hospital.services;

import com.hospital.bean.Patient;

public interface PatientService {

	//register patient
	public Patient registerPatient(Patient patient);
	//updatePatient details
	public Patient updatePatientDetails(Patient patient);
	//view patient
	public Patient viewPatient(String patientUser);
	//get all test results
	//public List<TestResult> getAllTestResult(String patientUserName);
	//view test result
	//public TestResult viewAllTestResult(int testResultId);
}
