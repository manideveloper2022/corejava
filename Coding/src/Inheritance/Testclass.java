package Inheritance;

public class Testclass {
	
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.id=701;
		p1.name="mani";
		p1.age=26;
		
		Employee e1=new Employee();
		e1.id=702;
		e1.name="murali";
		e1.age=30;
		e1.pan="erhpm1909q";
		e1.pfno="uan1013315q";
		
		
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.pan);
		System.out.println(e1.pfno);
	}

}
