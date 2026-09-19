package project;

import java.util.Date;

public class AlcoholTest extends Visit{	
	 private double bloodAlcholConcentration;
	 private String testResult;
	 
	 
	 
	 public AlcoholTest() {
		super();
	}
	
	 public AlcoholTest(Date visitDate, String symptoms, String diagnosis, Clinic theClinic ,double bloodAlcholConcentration ,String testResult) {
		super(visitDate, symptoms, diagnosis, theClinic);
		this.bloodAlcholConcentration = bloodAlcholConcentration;
		this.testResult = testResult;
	}
	 
	 public double getBloodAlcholConcentration() {
		 return bloodAlcholConcentration;
	 }
	 public void setBloodAlcholConcentration(double bloodAlcholConcentration) {
		 this.bloodAlcholConcentration = bloodAlcholConcentration;
	 }
	 public String getTestResult() {
		 return testResult;
	 }
	 public void setTestResult(String testResult) {
		 this.testResult = testResult;
	 }
	 
	 
	 @Override
	 public void generateReport() {
		 System.out.println("==== Alcohol Test Visit Information ====");
	        System.out.println("Visit Date: " + getVisitDate());
	        System.out.println("Symptoms: " + getSymptoms());
	        System.out.println("Diagnosis: " + getDiagnosis());
	        System.out.println("Clinic: " + getTheClinic().getClinicName());
	        System.out.println("Blood Alchol Concentration: " + bloodAlcholConcentration);
	        System.out.println("Test Result: " + testResult);
		
	 }
	 
}
