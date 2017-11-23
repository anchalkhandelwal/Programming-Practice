package notification.nurse;

import java.util.ArrayList;
import java.util.List;

import notification.nurse.helper.Scheduler;
import notification.patient.helper.Frequency;

public class NurseMain {

	public static void main(String[] args) {
		List<Nurse> nurseList = new ArrayList<Nurse>();
		
		Nurse sara = new Nurse("Sara");
		sara.addTime(Frequency.AFTERNOON);
		sara.addTime(Frequency.EVENING);
		
		Nurse bob = new Nurse("Bob");
		bob.addTime(Frequency.NIGHT);
		bob.addTime(Frequency.MORNING);
		
		nurseList.add(bob);
		nurseList.add(sara);
		
		Scheduler scheduler = new Scheduler();
		scheduler.addListener(bob);
		scheduler.addListener(sara);
		
		System.out.println("--------- Morning: -----------");
		scheduler.notifyListener(Frequency.MORNING);
		
		System.out.println("\n--------- Afternoon: -----------");
		scheduler.notifyListener(Frequency.AFTERNOON);
		
		System.out.println("\n--------- Evening: -----------");
		scheduler.notifyListener(Frequency.EVENING);
		
		System.out.println("\n--------- Night: -----------");
		scheduler.notifyListener(Frequency.NIGHT);
	}

}
