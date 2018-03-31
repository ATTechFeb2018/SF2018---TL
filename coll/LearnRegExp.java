package coll;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegExp {
	
	public static void main(String[] args) {
		/*String pattern="\\d{5}";
		String data = "Testleaf(12345) has no of employees 99999";
		String pattern="\\w[3,]\\W+@\\w[3,].\\w[3,]";
		String pattern="\\d{3}-\\d{8}";
		String data = "044-66374450";
		Pattern patt = Pattern.compile(pattern);
		Matcher mat = patt.matcher(data);
		System.out.println(mat.matches());
		while(mat.find()) {
			System.out.println(mat.group());
		}*/
		
		
		
		
		
		
		
		
		
		
		String data = "nesakumar.m@google.com";
		String pattern="[a-zA-Z0-9.]+@[a-zA-Z0-9]{3,}.[a-zA-Z]{3}||.[a-zA-Z]{3}";
		Pattern patt = Pattern.compile(pattern);
		Matcher mat = patt.matcher(data);
		System.out.println(mat.matches());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
