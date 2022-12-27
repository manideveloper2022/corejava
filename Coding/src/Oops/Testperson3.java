/*
Req: 
create one person obj
set data by taking input  
and display data
*/



package Oops;

import java.util.Scanner;

public class Testperson3 {

	public static void main(String[] args) {

    //input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int a1 = sc.nextInt();
		
		System.out.println("Enter Name:");
		String b1 = sc.next();
		
		System.out.println("Enter Age:");
		int c1 = sc.nextInt();
		
		
    //create the obj
		Person p1 = new Person();
		
		//set the data
		p1.id= a1;
		p1.age=c1;
		p1.name = b1;
		
		//show data
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
 
	}

}

  


  /* approch 2
  
  
  public class TestPerson3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create the obj
		Person p1 = new Person();
		
		//set the data
		System.out.println("enter id");
		p1.id=sc.nextInt();
		
		System.out.println("enter age");
		p1.age=sc.nextInt();
		
		System.out.println("enter name");
		p1.name =sc.next();
		
		//show data
		System.out.println(p1.id);
		System.out.println(p1.age);
		System.out.println(p1.name);
		
	}
}*/