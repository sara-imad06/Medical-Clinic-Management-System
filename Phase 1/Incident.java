package project;

import java.util.Date;

public class Incident extends Visit{
	private String severity ;
	private String bodyPart ;
	
	
	
	public Incident() {
		super();
	}
	
	public Incident(Date visitDate, String symptoms, String diagnosis, Clinic theClinic ,String severity, String bodyPart) {
		super(visitDate, symptoms, diagnosis, theClinic);
		this.severity = severity;
		this.bodyPart = bodyPart;
			
	}

	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getBodyPart() {
		return bodyPart;
	}
	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}
	
	@Override
	public void generateReport() {
		    System.out.println("==== Incident Visit Information ====");
	        System.out.println("Visit Date: " + getVisitDate());
	        System.out.println("Symptoms: " + getSymptoms());
	        System.out.println("Diagnosis: " + getDiagnosis());
	        System.out.println("Clinic: " + getTheClinic().getClinicName());
	        System.out.println("Severity: " + severity);
	        System.out.println("Body Part: " + bodyPart);
		
	}
	
	

}
