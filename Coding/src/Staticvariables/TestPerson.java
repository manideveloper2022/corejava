package Staticvariables;

public class TestPerson {
	public static void main(String[] args) {
		//accesss instance variables 
    Person p1 = new Person();
    
    p1.id=2000;
		p1.name="user1";
		p1.sal=233;
    
    //accesss static variables 
    Person.count = 3000;
    
    System.out.println(p1.id);
    System.out.println(p1.name);
    System.out.println(p1.sal);
    		System.out.println(Person.count);
    
    }
    
}