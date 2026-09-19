package project;

import java.util.Date;

public class Immunization extends Visit{
	private String vaccineName;
	private double dose;
	
	
	public Immunization() {
		super();
	}
	public Immunization(Date visitDate, String symptoms, String diagnosis, Clinic theClinic,String vaccineName, double dose) {
		super(visitDate, symptoms, diagnosis, theClinic );
		this.vaccineName = vaccineName;
		this.dose = dose;	
		}
	
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public double getDose() {
		return dose;
	}
	public void setDose(double dose) {
		this.dose = dose;
	}
	@Override
	public void generateReport() {
		 	System.out.println("==== Immunization Visit Information ====");
	        System.out.println("Visit Date: " + getVisitDate());
	        System.out.println("Symptoms: " + getSymptoms());
	        System.out.println("Diagnosis: " + getDiagnosis());
	        System.out.println("Clinic: " + getTheClinic().getClinicName());
	        System.out.println("Vaccine Name: " + vaccineName);
	        System.out.println("Dose: " + dose);
		
	}


}
