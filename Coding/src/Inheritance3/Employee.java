package Inheritance3;

public class Employee extends Person{
	
	private String pan;
	private String pfno;
	
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
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getPan());
		System.out.println(getPfno());
	}
		

}
