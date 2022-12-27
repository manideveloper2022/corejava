package Oops;

import java.util.Scanner;

public class testperson5 {

	public static void main(String[] args) {


		    //input
				Scanner sc=new Scanner(System.in);
				
				
				for(int i=1; i<=10; i++) {
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
					
					System.out.println(p1.id);
					System.out.println(p1.age);
					System.out.println(p1.name);
						
				}
		
		
	}

}
