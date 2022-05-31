package com.hospital.services;

import java.util.List;

import com.hospital.bean.DiagnosticCenter;
import com.hospital.bean.DiagnosticTest;

public interface DiagnosticCenterService {
	//Add center
	public DiagnosticCenter addCenter(DiagnosticCenter center);
	//edit center
	public DiagnosticCenter editDiagnosticCenter(int id);
	//get all diagnostic center services
	public List<DiagnosticCenter> getAllCenters();
	//get diagnostic center By Id
	public DiagnosticCenter diagnosticCenterById(int id);
	//add test to diagnostic center
	public DiagnosticCenter addTest(DiagnosticTest diagnosticTest);
	//get diagnostic center By name
	public DiagnosticCenter centerByName(String name);
	//get List of appointments


}
