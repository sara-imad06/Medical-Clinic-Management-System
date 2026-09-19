/* Name : Sara Imad Abdou
 * ID : 1241167
 * Sec : 3
 * Lab Sec :4
  */
package project;

import java.util.*;

public class Driver {
	static ArrayList<Patient> patientsList = new ArrayList<>();
	static ArrayList<Visit> vistisList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("===== Welcome to the Medical Clinic Management System =====");
		Scanner in = new Scanner(System.in);
		boolean check =true;
		while(check) {
		menuPrint();
		int userChoice;
		userChoice = in.nextInt();
		in.nextLine();


		if (userChoice ==1 || userChoice ==2 || userChoice ==3|| userChoice ==4) {			
			Patient p = infohandle();
			switch (userChoice) {
			case 1:
				System.out.println("==== Blood Test visit Info ====");
				System.out.println("Enter Date of Visit - Year then month then day :");
				int year = in.nextInt();
				int month = in.nextInt();
				int day = in.nextInt();
				in.nextLine();
				Date date = new Date(year - 1900, month - 1, day);
				System.out.println("Enter Symptoms :");
				String symptoms = in.nextLine();
				System.out.println("Enter Diagnosis:");
				String diagnosis = in.nextLine();
				Clinic clinic = clinicInfohandle();
				System.out.println("Enter RBC :");
				double RBC = in.nextDouble();
				System.out.println("Enter WBC :");
				double WBC = in.nextDouble();
				System.out.println("Enter PLT :");
				double PLT = in.nextDouble();
				BloodTest b = new BloodTest(date, symptoms, diagnosis, clinic, RBC, WBC, PLT);
				vistisList.add(b);
				p.addVisit(b); 
				
				
				break;
			case 2:
				System.out.println("==== Alcohol Test visit Info ====");
				System.out.println("Enter Date of Visit - Year then month then day :");
				int year2 = in.nextInt();
				int month2 = in.nextInt();
				int day2 = in.nextInt();
				in.nextLine();
				Date date2 = new Date(year2 - 1900, month2 - 1, day2);
				System.out.println("Enter Symptoms :");
				String symptoms2 = in.nextLine();
				System.out.println("Enter Diagnosis:");
				String diagnosis2 = in.nextLine();
				Clinic clinic2 = clinicInfohandle();
				System.out.println("Enter Blood Alcohol Concentration :");
				double bloodAlcholConcentration = in.nextDouble();
				System.out.println("Enter Test Result (POSITIVE/NEGATIVE):");
				String testResult = in.nextLine();
				testResult =testResult.toUpperCase();
				AlcoholTest a = new AlcoholTest(date2, symptoms2, diagnosis2, clinic2, bloodAlcholConcentration,testResult);
				vistisList.add(a);
				p.addVisit(a); 
				in.nextLine();


				break;

			case 3:
				System.out.println("==== Incident  Test visit Info ====");
				System.out.println("Enter Date of Visit - Year then month then day :");
				int year3 = in.nextInt();
				int month3 = in.nextInt();
				int day3 = in.nextInt();
				in.nextLine();
				Date date3 = new Date(year3 - 1900, month3 - 1, day3);
				System.out.println("Enter Symptoms :");
				String symptoms3 = in.nextLine();
				System.out.println("Enter Diagnosis:");
				String diagnosis3 = in.nextLine();
				Clinic clinic3 = clinicInfohandle();
				System.out.println("Enter Severity (LOW/MEDIUM/HIGH):");
				String severity = in.nextLine();
				severity=severity.toUpperCase();
				System.out.println("Enter Body Part :");
				String bodyPart = in.nextLine();
				Incident n = new Incident(date3, symptoms3, diagnosis3, clinic3, severity, bodyPart);
				vistisList.add(n);
				p.addVisit(n); 
				in.nextLine();

				break;

			case 4:
				System.out.println("==== Immunization Visit Info ====");
				System.out.println("Enter Date of Visit - Year then month then day :");
				int year4 = in.nextInt();
				int month4 = in.nextInt();
				int day4 = in.nextInt();
				in.nextLine();
				Date date4 = new Date(year4 - 1900, month4 - 1, day4);
				System.out.println("Enter Symptoms :");
				String symptoms4 = in.nextLine();
				System.out.println("Enter Diagnosis:");
				String diagnosis4 = in.nextLine();
				Clinic clinic4 = clinicInfohandle();
				System.out.println("Enter Vaccine Name :");
				String vaccineName = in.nextLine();
				System.out.println("Enter Dose:");
				double dose = in.nextDouble();
				Immunization m = new Immunization(date4, symptoms4, diagnosis4, clinic4, vaccineName, dose);
				vistisList.add(m);
				p.addVisit(m); 
				in.nextLine();
				break;
				default:
					System.out.println("Invalied entry");
					
				break;
		
		}
		}
		else if (userChoice == 5) {
			System.out.println("Enter Pateint Name :");
			String pName = in.nextLine();
			boolean isIN = false;
			for(Patient pInfo :patientsList ) {
				if (pInfo.getName().equalsIgnoreCase(pName)) {
					 pInfo.printInfo();
					isIN = true;
					break;

				}
				else if (!isIN) 
				    System.out.println("No Patient with this name in the system");
				}
		}
		else if (userChoice == 6) {
			System.out.println("Exiting the system .......");
			check=false;
		}
		else
			System.out.println("Invalied entry");

		}

					
			}
		

	public static void menuPrint() {
		System.out.println("1. New Blood Test Visit");
		System.out.println("2. New Alcohol Test Visit");
		System.out.println("3. New Incident Visit");
		System.out.println("4. New Immunization visit");
		System.out.println("5. Print Patient Visit information");
		System.out.println("6. Exit");
	}

	public static  Patient infohandle() {
		Scanner in = new Scanner(System.in);
		Patient p = new Patient();
		System.out.println("== Patient Information ==");
		System.out.println("Enter Patient Name : ");
		p.setName(in.nextLine());
		System.out.println("Enter Date Of Birth - Year then month then day :");
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		Date date = new Date(year - 1900, month - 1, day);
		p.setDateOfBith(date);
		System.out.println("Enter Gender: ");
		p.setGender(in.next());
		System.out.println("Enter city occupation: ");
		p.setCityOcc(in.next());
		System.out.println("Do you have Insurance (Yes or No) ");
		String answ = in.next();
		boolean insure;
		if (answ.equalsIgnoreCase("Yes"))
			insure = true;
		else if (answ.equalsIgnoreCase("No"))
			insure = false;
		else
			insure = false;
		p.setHasInsurance(insure);
		patientsList.add(p);
		return p;

	}

	public static Clinic clinicInfohandle() {
		Scanner in = new Scanner(System.in);
		System.out.println("== Clinic Information ==");
		System.out.println("Enter Clinic Name : ");
		String cinicName = in.nextLine();
		System.out.println("Enter Location :");
		String location = in.nextLine();
		System.out.println("Enter Telephone: ");
		String telephone = in.nextLine();
		Clinic c = new Clinic(cinicName, location, telephone);
		return c;

	}
	
}
