package Inheritance2;
public class Testclass2 {

	public static void main(String[] args) {
		Person p=new Person();
		
		p.id=701;
		p.name="mani";
		p.age=26;
		
		Employee e=new Employee();
		
		e.id=702;
		e.name="murali";
		e.age=30;
		e.pan="erhpm1909q";
		e.pfNo="uan1013315q";
		
		p.displayPerson();
		System.out.println("-------------------------------");
		e.displayPerson();
		e.displayEmp();
		
	}

}
