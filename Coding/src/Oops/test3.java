package Oops;

import java.util.Scanner;

/*
Requirement to capture id,name,age for <count> persons.
Req: 
take input for size

you need to take input for (id,name, age) for size number of times
and display data

*/

public class test3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter Count");	
	  int cont = sc.nextInt();
	  
	  for (int i=0; i<=cont; i++) {
	  
	  System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter name");
		String name = sc.next();
	  
		Person p1= new Person();
	  		
		p1.id=id;
		p1.age=age;
		p1.name=name;
		
		
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
		 
	  }
		

	}

}
