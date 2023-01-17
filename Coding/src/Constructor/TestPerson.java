package Constructor;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
        
		p.id= 200;
		p.name = "mango";
		p.age = 18;
		
		
		Person p1 = new Person(2000, "mani", 26);
		
		Person p3 = new Person("murali", 30);
		p3.id=25;
		
		
		p.Display();
		
		p1.Display();
		
		p3.Display();
		
	}

}
