package notification.nurse;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import notification.nurse.helper.AlarmListener;
import notification.patient.helper.Frequency;

public class Nurse implements AlarmListener{
	private String name;
	private Set<Frequency> times = new HashSet<Frequency>();
	
	public Nurse(String name){
		this.name = name;
	}
	
	public void addTime(Frequency time){
		this.getTimes().add(time);
	}

	public void notify(Frequency time, String message) {
		if(times.contains(time)){
			switch(time){
			case MORNING:
				Timer timer = new Timer();
				TimerTask hourlyTask = new TimerTask(){

					@Override
					public void run() {
						//Calendar calendar = Calendar.getInstance();
						//calendar.add(Calendar.HOUR, 1);
//						
//						//get the patient list & medication list
//						//check for matching medication list
						
						System.out.println(name);
						System.out.println("Notified of: ");
					}
				};
				timer.schedule(hourlyTask, 01, 1000*60);
			case AFTERNOON:
				Timer timer1 = new Timer();
				TimerTask hourlyTask1 = new TimerTask(){

					@Override
					public void run() {
					//	Calendar calendar = new GregorianCalendar();
						//calendar.add(Calendar.HOUR_OF_DAY, 5);
//						Calendar calendar = Calendar.getInstance();
//						calendar.add(Calendar.HOUR, 1);
						System.out.println(name);
						System.out.println("Notified of event: "+ times.size()+": ");
					
					}		
				};
				timer1.schedule(hourlyTask1, 01, 1000);
			}

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Frequency> getTimes() {
		return times;
	}

	public void setTimes(Set<Frequency> times) {
		this.times = times;
	}
}
