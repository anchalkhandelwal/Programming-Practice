package patient;

import java.util.List;

import patient.helper.Medication;

public class Patient {
	private String name;
	private List<Medication> medicationList;

	// check if the patient is on any medication
	public boolean hasMedication() {
		return this.getMedicationList().size() > 0 ? true : false;
	}

	// get all medication details
	public String medicationInfo() {
		StringBuffer medicationInfo = new StringBuffer();
		if (hasMedication()) {
			medicationInfo.append("Patient Name: "+ this.getName());
			for (int i = 0; i < this.getMedicationList().size(); i++) {
				medicationInfo.append("\n Medication Name "+ this.getMedicationList().get(i).getName() );
				medicationInfo.append(" Start Date: "+ this.getMedicationList().get(i).getStartDate() );
				if(medicationList.get(i).getEndDate() != null){
					medicationInfo.append(" End Date: "+ this.getMedicationList().get(i).getEndDate() );
				}
			}
		}
		return medicationInfo.toString();
	}

	public Patient(String name, List<Medication> medicationList) {
		this.name = name;
		this.medicationList = medicationList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Medication> getMedicationList() {
		return medicationList;
	}

	public void setMedicationList(List<Medication> medicationList) {
		this.medicationList = medicationList;
	}
}
