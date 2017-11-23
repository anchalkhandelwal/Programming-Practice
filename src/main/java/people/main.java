package people;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {
	public static void main(String[] args) {
		Map<String, Date> patientMap = new HashMap<String, Date>();

		Date saraDate = new Date();
		Date bobDate = new Date();
		Date monicaDate = new Date();
		Date andyDate = new Date();
		Date robDate = new Date();
		Date robertDate = new Date();
		Date robDate2 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			saraDate = sdf.parse("10/05/2016");
			bobDate = sdf.parse("10/12/2016");
			monicaDate = sdf.parse("10/11/2016");
			andyDate = sdf.parse("10/02/2016");
			robDate = sdf.parse("10/05/2016");
			robertDate = sdf.parse("01/05/2017");
			robDate2 = sdf.parse("02/05/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		patientMap.put("Sara", saraDate);
		patientMap.put("Bob", bobDate);
		patientMap.put("Monica", monicaDate);
		patientMap.put("Andy", andyDate);
		patientMap.put("Rob", robDate);
		patientMap.put("Robert", robertDate);
		patientMap.put("Rob", robDate2);

		Iterator iterator = patientMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			System.out.println(pair.getKey() + " ---- " + pair.getValue());
		}

		// sorting
		Map<String, Date> map = sortByValues(patientMap);
		System.out.println("After Sorting:");
		Set set2 = map.entrySet();
		Iterator iterator2 = set2.iterator();
		int count = 0;
		while (iterator2.hasNext() && count < 3) {
			Map.Entry me2 = (Map.Entry) iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
			count++;
		}

		// allergy and severity linked with patient
		// List<Patient> patientList = new ArrayList<Patient>();
		// List<Allergy> saraAllergy = new ArrayList<Allergy>();
		// List<Allergy> bobAllergy = new ArrayList<Allergy>();
		//
		// Allergy milk = new Allergy("Milk", Severity.LOW);
		// Allergy fruits = new Allergy("Fruits", Severity.HIGH);
		// Allergy candles = new Allergy("Candles", Severity.HIGH);
		// Allergy marker = new Allergy("Marker", Severity.MEDIUM);
		// Allergy smoke = new Allergy("Smoke", Severity.LOW);
		//
		// saraAllergy.add(smoke);
		// saraAllergy.add(marker);
		// saraAllergy.add(candles);
		//
		// bobAllergy.add(fruits);
		// bobAllergy.add(milk);
		// bobAllergy.add(smoke);
		//
		// Patient sara = new Patient("Sara", saraAllergy);
		// Patient bob = new Patient("Bob", bobAllergy);
		//
		// patientList.add(sara);
		// patientList.add(bob);
		//
		// for(Patient patient : patientList){
		// System.out.println(patient.getAllergyInfo());
		// }
    
	}

	private static HashMap sortByValues(Map<String, Date> patientMap) {
		List list = new LinkedList(patientMap.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}
