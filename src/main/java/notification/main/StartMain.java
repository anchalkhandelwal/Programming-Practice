package notification.main;

import java.util.ArrayList;
import java.util.List;

import notification.patient.Patient;
import notification.patient.helper.Disease;
import notification.patient.helper.Frequency;
import notification.patient.helper.Medication;

public class StartMain {
	public static void main(String args[]){
		List<Patient> patientList = new ArrayList<Patient>();
		
		//Disease List
		List<Disease> saraDisease = new ArrayList<Disease>();
		//saraDisease.add(new Disease("fever"));
		saraDisease.add(new Disease("cold"));
		saraDisease.add(new Disease("cough"));
		
		List<Disease> bobDisease = new ArrayList<Disease>();
		bobDisease.add(new Disease("fever"));
		
		//Medication and frequency
		List<Medication> coldList = new ArrayList<Medication>();
		List<Frequency> coldMeds = new ArrayList<Frequency>();
		coldMeds.add(Frequency.NIGHT);
		coldMeds.add(Frequency.MORNING);
		
		List<Medication> coughList = new ArrayList<Medication>();
		List<Frequency> coughMeds = new ArrayList<Frequency>();
		coughMeds.add(Frequency.AFTERNOON);
		coughMeds.add(Frequency.EVENING);
		coughMeds.add(Frequency.NIGHT);
		
		coldList.add(new Medication("Cold", coldMeds) );
		coughList.add(new Medication("Cough", coughMeds));
		
		Patient sara = new Patient("Sara", saraDisease);
		sara.setMedication(coldList);
		
		Patient bob = new Patient("Bob", bobDisease);
		bob.setMedication(coughList);
		
		patientList.add(bob);
		patientList.add(sara);
		
		for(Patient patientIterator : patientList){
			System.out.println(patientIterator.getName());
			System.out.println(patientIterator.getDiseaseList());
			System.out.println(patientIterator.getMedicationList());
		}
	}
}
