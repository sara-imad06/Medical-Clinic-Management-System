package project;
import java.util.*;


public class Patient {
	private String name;
	private Date dateOfBirth;
	private String gender;
	private String cityOcc ;
	private boolean hasInsurance;
	private ArrayList<Visit> patientVisits = new ArrayList<>();
 ;
	
	
	
	
	public Patient() {}

	public Patient(String name, Date dateOfBith, String gender, String cityOcc, boolean hasInsurance,
			ArrayList<Visit> patientVisits) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBith;
		this.gender = gender;
		this.cityOcc = cityOcc;
		this.hasInsurance = hasInsurance;
	    this.patientVisits = patientVisits;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBith() {
		return dateOfBirth;
	}

	public void setDateOfBith(Date dateOfBith) {
		this.dateOfBirth = dateOfBith;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCityOcc() {
		return cityOcc;
	}

	public void setCityOcc(String cityOcc) {
		this.cityOcc = cityOcc;
	}

	public boolean isHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}


	public ArrayList<Visit> getPatientVisits() {
		return patientVisits;
	}



	public void setPatientVisits(ArrayList<Visit> patientVisits) {
		this.patientVisits = patientVisits;
		}
	
	
	
	public void addVisit (Visit myVisit){
		patientVisits.add(myVisit);
	}


	
	public void printInfo() {
		System.out.println( "==== Patient Information ==== ");
		System.out.println("Name: " + name);
	    System.out.println("Date of Birth: " + dateOfBirth);
	    System.out.println("Gender: " + gender);
	    System.out.println("City Occupation: " + cityOcc);
	    System.out.println("Has Insurance: " + hasInsurance);
		System.out.println("== Patient Visits List == ");
		for (Visit v : patientVisits) {
            v.generateReport();
	}
	}
}

