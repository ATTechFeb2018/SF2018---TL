package coll;

import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> empNames = new LinkedHashSet<String>();
		empNames.add("Gopi");
		empNames.add("Maha Raja");
		empNames.add("Koushik");
		empNames.add("Koushik");
		System.out.println(empNames.size());
		//Collections.sort(empNames);
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





