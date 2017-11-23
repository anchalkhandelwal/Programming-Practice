package notification.nurse.helper;

import java.util.ArrayList;
import java.util.List;

import notification.patient.helper.Frequency;

public class Scheduler {
	private List<AlarmListener> alarmList = new ArrayList<AlarmListener>();
	
	public void addListener(AlarmListener alarmListener){
		this.alarmList.add(alarmListener);
	}
	
	public void notifyListener(Frequency time){
		for(AlarmListener al : alarmList){
			al.notify(time, time.name());
		}
	}
}
