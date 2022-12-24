package Conditionsexm;

import java.util.Scanner;

/*
1.Take input for username and password
 if username value ="admin" and password value ="admin" then print ==> "login success"   
 if not print  => "login failure"  
 */
 


public class exm10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String un = sc.next();
		System.out.println("Enter passward");
		String pw = sc.next();
		
		
		if(un.equals("admin") && pw.equals("admin")) {
			System.out.println("login success");
		}else {
			System.out.println("login failure");
		}
		
		
	}

}
