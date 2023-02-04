package Inheritance4;

public class Employee extends Person{
	
	 String pan;
	String pfno;
	
	public Employee(int id, String name, int age, String pan, String pfno) {
		super(id, name, age);
		this.pan = pan;
		this.pfno = pfno;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPfno() {
		return pfno;
	}
	public void setPfno(String pfno) {
		this.pfno = pfno;
	}
	
	public void displayEmp(){
		System.out.println("===========EMPLOYEE DETAILS==============");
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getPan());
		System.out.println(getPfno());
	}
		

}
