package YTex;// In methods - Instant and Static example

import java.util.Scanner;

public class exm7 {

	void min(int a, int b)
	
	{
		if (a>b)
			System .out.println(+a+" is max");
		else
			System .out.println(+b+" is max");
	}
	
	
	public static void main(String[] args) {
		
		 exm7 m1=new exm7();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter 2 no");
		 int c= sc.nextInt();
		 int d= sc.nextInt();
		 m1.min(c,d);
		
		
	}

}
