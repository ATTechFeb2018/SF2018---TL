package learnstring;

public class StringFun {
	
	
	public void stringMethods() {
		int i = 10;
		String txt1 = new String("hello");
		int n= txt1.charAt(0);
		
		
		System.out.println((char) (n+1));
		/*String txt2 = new String("Hello");
		System.out.println(txt1==txt2);
		*/
		/*String txt3 = "3-25-2018";
		Integer k = 10;
		String s =k.toString();
		System.out.println(s+10);*/
//		System.out.println(txt2.replaceAll(" ",""));
		//System.out.println(txt2.contains("a"));
		/*String[] split = txt3.split("-");
		for (int j = 0; j < split.length; j++) {
			System.out.println(split[j]);
		}*/
		//System.out.println("Lower "+txt2.toLowerCase()+" Upper "+txt2.toUpperCase());
		//System.out.println(txt2.length());
		//System.out.println(txt2.trim().length());
		//System.out.println(txt2.substring(0, 4));
		//System.out.println(txt1.concat(txt2));
		//System.out.println(txt2.lastIndexOf('e'));
		//System.out.println(txt2.charAt(4));		
		//System.out.println(txt1.length());
		/*char[] stringChar = txt1.toCharArray();
		for (int j = 0; j < stringChar.length; j++) {
			System.out.println(j+" char "+stringChar[j]);
		}*/
	}
	
	public static void main(String[] args) {
		
		StringFun obj = new StringFun();
		obj.stringMethods();
		
	}

}
