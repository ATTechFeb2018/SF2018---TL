package coll;

public class LearnStatic{
	public static int num;
	public int num1 = 15;
	public static void main(String[] args) {
		System.out.println("main method "+num);
		test();	
		
	}
	
	static {
		num=10;
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("static test");
	}
	
	
	
	
	
	
	
	
	
	//System.out.println(num);

			/*LearnStatic obj = new LearnStatic();
			obj.increment();
			obj.increment();
			LearnStatic obj1 = new LearnStatic();
			obj1.increment();
			LearnStatic obj2 = new LearnStatic();
			obj2.increment();*/
	
	
	
	
	
	
	
	
	
	
	
	public void increment() {
		num++;
		num1++;
		System.out.println("static --> " + num+" nonstatic --> " + num1);

	}

	

	

}
