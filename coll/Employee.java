package coll;

public abstract class Employee {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee pm = new PermanentEmp();
		pm.getSalary();
		pm.getCompanyName();
		Employee cm = new ContractEmp();
		cm.getSalary();
		cm.getCompanyName();
	}

	//public abstract void test();

	public void getCompanyName() {
		System.out.println("TestLeaf");
	}
	public abstract void getSalary();
	
	
	
	
	
	
	
	
	
	

}
