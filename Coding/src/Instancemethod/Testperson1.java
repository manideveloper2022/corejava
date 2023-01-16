package Instancemethod;

public class Testperson1 {

	
	public static void main(String[] args) {
		
		Person2 p1=  new Person2();
		
		p1.id=10;
	    p1.name="mani";
	    p1.age=26;
	    
	    
	    System.out.println("**************printing p1****************");
		// cal the display function
	    p1.print();
	    
	    
	 // cal the display function	// create obj
	 		Person2 p2 = new Person2();
	 		// set the data
	 		p2.id = 2011;
	 		p2.name = "user3";
	 		p2.age = 26;
	 		System.out.println("**************printing p2****************");
	 		p2.print();// prints the id,name, age for p2 obj
		
	 		
	 		Person2 p3 = new Person2();
	 		
	 		p3.id=2023;
	 		p3.name="murali";
	 		p3.age=30;
	 		System.out.println("**************printing p3****************");
	 		p3.print();
		}
	
	
}
