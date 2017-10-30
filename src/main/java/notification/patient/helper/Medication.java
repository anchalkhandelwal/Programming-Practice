package notification.patient.helper;

import java.util.List;

public class Medication {
	private String name;
	private List<Frequency> times;
	
	//constructor
	public Medication(String name, List<Frequency> times) {
		this.name = name;
		this.times = times;
	}
	
	//methods
	public String getFrequencyList(){
		StringBuffer frequencyList = new StringBuffer();
		//frequencyList.append(this.getName());
		for(int i = 0; i < this.getTime().size() ; i++){
			frequencyList.append(this.getTime().get(i) + "\n");
		}
		return frequencyList.toString();
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Frequency> getTime() {
		return times;
	}

	public void setTime(List<Frequency> times) {
		this.times = times;
	}
	
}
