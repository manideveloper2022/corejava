package Instancemethod;


/*

1.take 2 nums and perform operations

2.	Create a calculator class
	and provide
	4 methods:
	sum()
	sub()
	mul()
	div()


#Approach#2:
 create class with instance variables for n1 and n2
 provide methods for every operation  by accessing the instance variables
 
 #instance method can access the instance variables

*/


public class Calculator {
	
	public void sum(int n1, int n2) {
		System.out.println("Sum = " + (n1+n2));
	}
	
	public void mul(int n1, int n2) {
		System.out.println("mul = " + (n1*n2));
	}
	
	public void div(int n1, int n2) {
		System.out.println("div = " + (n1/n2));
	}
	
	public void sub(int n1, int n2) {
		System.out.println("Sub = " + (n1-n2));
	}

}
