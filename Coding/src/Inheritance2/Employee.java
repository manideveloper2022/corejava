package Inheritance2;
public class Employee extends Person{ // Person is parent; Employee is child


	String pan;
	String pfNo;
	
	public void displayEmp(){
		System.out.println(pan);
		System.out.println(pfNo);
	}
}