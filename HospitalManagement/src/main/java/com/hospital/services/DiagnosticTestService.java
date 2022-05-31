package com.hospital.services;

import java.util.List;

import com.hospital.bean.DiagnosticTest;

public interface DiagnosticTestService {
	
	//get all tests
	public List<DiagnosticTest> getAllTests();
	//add new test
	public DiagnosticTest addDiagnosticTest(DiagnosticTest diagnosticTest);
	//update test details
	public DiagnosticTest updateTestDetails(DiagnosticTest diagnosticTest);
	//get tests of diagnostic centers
	public List<DiagnosticTest> getTestOfDiagnosticCenter(DiagnosticTest diagnosticTest);
	//remove test from diagnostic center
	public boolean removeTestFromDiagnoticCenter(int centerId,DiagnosticTest diagnosticTest);
	

}
