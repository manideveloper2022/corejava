package Collections.arrays;

import java.util.Scanner;

public class TestPersons2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Person");
		int input =sc.nextInt();
		
		Person[] persons = new Person[input];
		
		for (int i=0; i<input; i++) {
			System.out.println("Enter ID: "+ (i+1));
			int id = sc.nextInt();
		
			System.out.println("Enter Name: "+ (i+1));
			String name = sc.next();
			
			persons[i]=new Person(id, name);
			
		}
		
		System.out.println("*******show all persons**********************");
	    for(Person p : persons) {
	    	System.out.println(p.getId() + " -  " + p.getName());
	    }

}
}