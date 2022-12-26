




package Conditionsexm;

/*

1.Take input for
id(int) , age(int) , usertype(string)

2.perform validations
- id should be positive
- age should be greater than 18
- usertype should be "admin"

3. if id is correct then only validate the age
   if age is correct then only validate the usertype
   
   if id is incorrect stop prog immediately
   if age is incorrect stop prog immediately
   
   if id is wrong, then dont check for age 
   if id is valid , then only check for age
   
   if age is wrong, then dont check for userType 
   if age is valid , then only check for userType


*/

import java.util.Scanner;

public class exm5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter usertype");
		String usertype = sc.next();
		
		//id check logic
		if( id>0) {
			//id is valid
			System.out.println("valid id");
			//check for age
			if( age>18) {
				System.out.println("valid age");
				if (usertype.equals("admin"))
				{
					System.out.println("valid usertype");
				}else {
					
					System.out.println("not valid usertype");
				}
				
			}else {
				System.out.println("not valid age");
			}
			
		}else {
			System.out.println("not valid id");
		}

	}

}
