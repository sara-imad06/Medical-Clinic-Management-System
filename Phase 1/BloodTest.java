package project;

import java.util.Date;

public class BloodTest extends Visit{
	private double RBC;
	private double WBC;
	private double PLT;
	
	
	public BloodTest() {}

	public BloodTest(Date visitDate, String symptoms, String diagnosis, Clinic theClinic ,double RBC,double WBC,double PLT) {
		super(visitDate, symptoms, diagnosis, theClinic);
		this.RBC = RBC;
		this.WBC = WBC;
		this.PLT = PLT;
		
	}
	
	
	public double getRBC() {
		return RBC;
	}

	public void setRBC(double RBC) {
		this.RBC = RBC;
	}

	public double getWBC() {
		return WBC;
	}

	public void setWBC(double WBC) {
		this.WBC = WBC;
	}

	public double getPLT() {
		return PLT;
	}

	public void setPLT(double PLT) {
		this.PLT = PLT;
	}

	@Override
	public void generateReport() {
		System.out.println("==== Blood Test Visit Information ====");
        System.out.println("Visit Date: " + getVisitDate());
        System.out.println("Symptoms: " + getSymptoms());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Clinic: " + getTheClinic().getClinicName());
        System.out.println("RBC: " + 	RBC);
        System.out.println("WBC: " + WBC);
        System.out.println("PLT: " + PLT);
		
	}


}
