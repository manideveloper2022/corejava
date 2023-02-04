package Inheritance5;

public class Testclass {
	
	public static void main(String[] args) {
		
		
		Person p = new Person(733892, "Mani", 26);
		Employee e = new Employee(11870, "Murali", 30, "ERHPM1909Q", "UAN10012478");
		System.out.println("===========PERSON DETAILS==============");
		p.display();
		e.display();
		
		
	}
	

}
