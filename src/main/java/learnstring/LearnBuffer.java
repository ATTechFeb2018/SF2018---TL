package learnstring;

public class LearnBuffer {

	public static void main(String[] args) {
		/*String s = "hello";
		s = s.concat("world");
		System.out.println(s);*/
		//Thread Safe
		/*StringBuffer buffer = new StringBuffer("Testleaf");
		buffer.append(" Welcome");
		buffer.reverse();
		System.out.println(buffer);*/
		
		//not Thread Safe
		StringBuilder builder = new StringBuilder("Testleaf");
		builder.reverse();
		System.out.println(builder);
	}

}





