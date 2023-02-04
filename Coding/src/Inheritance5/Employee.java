package Inheritance5;

public class Employee extends Person{

	String pan;
	String pf;
	public Employee(int id, String name, int age, String pan, String pf) {
		super(id, name, age);
		this.pan = pan;
		this.pf = pf;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPf() {
		return pf;
	}
	public void setPf(String pf) {
		this.pf = pf;
	}
	
	
	public void display(){
		System.out.println("===========EMPLOYEE DETAILS==============");
		super.display();
		System.out.println(getPan());
		System.out.println(getPf());
	  }
	
	
}
