package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<String> empNames = new ArrayList<String>();
		empNames.add("Gopi");
		empNames.add("Maha Raja");
		empNames.add("Koushik");
		empNames.add("koushik");
		System.out.println(empNames.size());
		Collections.sort(empNames);
		for (String names : empNames) {
			System.out.println(names);
		}
		/*System.out.println("after removing");
		empNames.remove(0);
		for (String names : empNames) {
			System.out.println(names);
		}
		System.out.println(empNames.contains("Maha Raja"));
		
		System.out.println(empNames.isEmpty());
		//empNames.clear();
		System.out.println(empNames.isEmpty());
		*/

	}

}





