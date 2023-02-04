package Inheritance.multilevel;
public class Staff extends Employee {

	String contractID;
	String contractPeriod;
	 
	public Staff(int id, String name, int age, String pfNo, String pan, String contractID, String contractPeriod) {
		super(id, name, age, pfNo, pan);//call the employee constr
		this.contractID = contractID;
		this.contractPeriod = contractPeriod;
	}

	public void displayStaff() {
		System.out.println("===========STAFF DETAILS==============");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(pan);
		System.out.println(pfno);
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}
	 
}