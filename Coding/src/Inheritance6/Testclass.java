package Inheritance6;



/*
  RBI : parent class
        - createAcc
        - processLoan
  HDFC, ICICI , SBI are child classes for RBI
  
  HDFC, ICICI , SBI  : overriding the processLoan() method
  
  Take Bank name as input
  if Bank name is "hdfc" then create obj for hdfc class and call createAcc() and processLoan() methods. 
  if Bank name is "sbi" then create obj for SBI Class and call createAcc() and processLoan() methods. 
  if Bank name is "icici" then create obj for ICICI and call createAcc() and processLoan() methods. 
 
 */


import java.util.Scanner;

public class Testclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name ::");
		String input = sc.nextLine();
		
		
		
		if (input.equalsIgnoreCase("Hdfc")) {
			
			Hdfc h=new Hdfc();
			h.createAcc();
			h.processLoan();
		}else if (input.equalsIgnoreCase("Icici")) {
			
			Icici i = new Icici();
			i.createAcc();
			i.processLoan();
		}else if(input.equalsIgnoreCase("SBI")){
			SBI s = new SBI();
			s.createAcc();
			s.processLoan();			
		}
		
	}
	
	
}
