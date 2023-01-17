package Constructor;

public class Person {
    //instance variables
	
	int id;
	String name;
	int age;
	public Person() {
		System.out.println("inside zero org constructor");
	}
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		
		System.out.println("inside 3 org constructor");
	}
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println("inside 2 org constructor");
	}
	
	public void Display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	
}
