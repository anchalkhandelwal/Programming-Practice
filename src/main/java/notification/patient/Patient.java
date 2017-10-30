package notification.patient;

import java.util.List;

import notification.patient.helper.Disease;
import notification.patient.helper.Medication;

public class Patient {
	private String name;
	private List<Disease> disease;
	private List<Medication> medication;
	
	//Constructor
	public Patient(String name, List<Disease> disease) {
		this.name = name;
		this.disease = disease;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Disease> getDisease() {
		return disease;
	}

	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}

	public List<Medication> getMedication() {
		return medication;
	}

	public void setMedication(List<Medication> medication) {
		this.medication = medication;
	}
	
	public String getDiseaseList(){
		StringBuffer diseaseList = new StringBuffer();
		for(Disease diseaseIterator : this.getDisease() ){
			diseaseList.append(diseaseIterator.getName()+"\n");
		}
		return diseaseList.toString();
	}
	
	public String getMedicationList(){
		StringBuffer medicineList = new StringBuffer();
		for(Medication medicineIterator : this.getMedication() ){
			medicineList.append(medicineIterator.getName() +": ");
			medicineList.append(medicineIterator.getFrequencyList() + "\n");
		}
		return medicineList.toString();
	}
	
}
