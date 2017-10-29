package patient.helper;

import java.util.Date;

public class Medication {
	private String name;
	private Date startDate;
	private Date endDate;
	
	public Medication(String name, Date startDate, Date endDate){
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Medication(String name, Date startDate){
		this.name = name;
		this.startDate = startDate;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Date getStartDate(){
		return startDate;
	}
	
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	
	public Date getEndDate(){
		return endDate;
	}
	
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
}
