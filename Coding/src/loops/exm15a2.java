package loops;

import java.util.Scanner;

public class exm15a2 {

	public static void main(String[] args) {


		 int sum =0;
			Scanner sc = new Scanner(System.in);
		  
		  
		  while(sum <= 100) {
		  System.out.println("Enter number: ");
				int num = sc.nextInt();
		  
		   
		   
				if(num < 0) {
		    //for skipping the current iteration we need to use "continue"
					continue; // stop the current run/iteration and go to the next run/iterations
				}
		    
		    
		     sum = sum + num;
		    
		  
		  }
		  
		  
		  System.out.println("sum = " + sum);
		

	}

}
