package Inheritance3;
public class Testclass2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(301);
		p.setName("mani");
		p.setAge(26);
		Employee e= new Employee();
		e.setId(302);
		e.setName("murali");
		e.setAge(30);
		e.setPan("erkjs1985a");
		e.setPfno("uan1654118");
		System.out.println("=========PERSON DETAILS===========");
		p.displayPerson();
		System.out.println("=========EMPLOYEE DETAILS===========");
		e.displayEmp();
	}
}
