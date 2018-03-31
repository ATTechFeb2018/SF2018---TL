package coll;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<Integer, String> mentors = new HashMap<Integer, String>();
		mentors.isEmpty();
		mentors.put(10014, "Nesa");
		mentors.put(10016, "Nesa");
		mentors.put(10015, "CowSick");
		mentors.put(10000, "Babu");
		mentors.put(42001, "Gopi");
		System.out.println(mentors.entrySet());
		mentors.put(10012, "Sarath");
		mentors.put(10016, "Maharaja");

		System.out.println(mentors.entrySet());
			System.out.println(mentors.keySet());
		System.out.println(mentors.values());
		System.out.println(mentors.get(10000));
		System.out.println(mentors.containsValue("Sarath"));
		mentors.isEmpty()
		System.out.println(mentors.containsValue("raja"));*/
		/*
		Map<Integer, String> mentors = new TreeMap<Integer, String>();
		System.out.println(mentors.isEmpty());
		mentors.put(10014, "Nesa");
		mentors.put(10016, "Nesa");
		mentors.put(10015, "CowSick");
		mentors.put(10000, "Babu");
		mentors.put(42001, "Gopi");
		System.out.println(mentors.entrySet());
		mentors.put(10012, "Sarath");
		mentors.put(10016, "Maharaja");
		
		for (Entry<Integer, String> string : mentors.entrySet()) {
			 System.out.println("key --> " + string.getKey() +" value -->  " + string.getValue());
		}
		*/
		
		String name = "testleaf";
		
		char[] charArray2 = name.toCharArray();
		
		Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
		
		for (char c : charArray2) {
			if(map.containsKey(c)) {
				//Integer cnt = map.get(c);
				map.put(c, map.get(c)+1);//Incrementing the value as 1
			}else{
				map.put(c, 1);//Storing value as 1
			}
		}
		System.out.println(map.toString());
		
		
		
		
		
		
		
		
		
		
		
		char[] charArray = name.toCharArray();
		Map<Character, Integer> mentors = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if(mentors.containsKey(c)) {
				mentors.put(c, mentors.get(c)+1);	
			}else{
				mentors.put(c, 1);
			}
		}
		System.out.println(mentors.toString());
		
		
		
		
		
		
		
		
	}

}
