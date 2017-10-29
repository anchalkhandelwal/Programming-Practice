package patient.helper;

import java.util.List;

public class Patient {
	private String name;
	private List<Medication> medicationList;
	private List<Allergy> allergyList;

	// patient name getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// allergy associated with patient
	public List<Allergy> getAllergy() {
		return allergyList;
	}

	public void setAllergy(List<Allergy> allergyList) {
		this.allergyList = allergyList;
	}

	public Patient(String name, List<Allergy> allergyList) {
		this.name = name;
		this.allergyList = allergyList;
	}
	
	public String getAllergyInfo(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Patient Name is: "+this.getName()+"\n");
		for(int i = 0; i < allergyList.size(); i++){
			stringBuffer.append(" Allergy: "+this.getAllergy().get(i).getName());
			stringBuffer.append(" with severity: "+this.getAllergy().get(i).getSeverity()+"\n");
		}
		return stringBuffer.toString();
	}

	// check if the patient is on any medication
	// public boolean hasMedication() {
	// return this.getMedicationList().size() > 0 ? true : false;
	// }

	// get all medication details
	// public String medicationInfo() {
	// StringBuffer medicationInfo = new StringBuffer();
	// if (hasMedication()) {
	// medicationInfo.append("Patient Name: "+ this.getName());
	// for (int i = 0; i < this.getMedicationList().size(); i++) {
	// medicationInfo.append("\n Medication Name "+
	// this.getMedicationList().get(i).getName() );
	// medicationInfo.append(" Start Date: "+
	// this.getMedicationList().get(i).getStartDate() );
	// if(medicationList.get(i).getEndDate() != null){
	// medicationInfo.append(" End Date: "+
	// this.getMedicationList().get(i).getEndDate() );
	// }
	// }
	// }
	// return medicationInfo.toString();
	// }

	// public Patient(String name, List<Medication> medicationList) {
	// this.name = name;
	// this.medicationList = medicationList;
	// }

	// public List<Medication> getMedicationList() {
	// return medicationList;
	// }
	//
	// public void setMedicationList(List<Medication> medicationList) {
	// this.medicationList = medicationList;
	// }
}
