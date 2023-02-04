package Inheritance.multilevel;

public class Employee extends Person{
	
	 String pan;
	String pfno;
	
	public Employee(int id, String name, int age, String pan, String pfno) {
		super(id, name, age);
		this.pan = pan;
		this.pfno = pfno;
	}
	
	public void displayEmp(){
		System.out.println("===========EMPLOYEE DETAILS==============");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(pan);
		System.out.println(pfno);
	}
		

}
