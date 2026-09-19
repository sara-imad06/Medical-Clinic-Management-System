package project;
import java.util.*;


public abstract class Visit implements Reportable{
	private Date visitDate;
	private String symptoms;
	private String diagnosis;
	private Clinic theClinic;
	
	
	
	public Visit() {
		super();
	}


	public Visit(Date visitDate, String symptoms, String diagnosis, Clinic theClinic) {
		//super();
		this.visitDate = visitDate;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		this.theClinic = theClinic;
	}


	public Date getVisitDate() {
		return visitDate;
	}


	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}


	public String getSymptoms() {
		return symptoms;
	}


	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}


	public Clinic getTheClinic() {
		return theClinic;
	}


	public void setTheClinic(Clinic theClinic) {
		this.theClinic = theClinic;
	}
	
	
	

	
	

}
