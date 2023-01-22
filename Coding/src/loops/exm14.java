package loops;

import java.util.Scanner;

public class exm14 {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			int num = 0;
			int sum= 0;
		  
		  while(num >= 0){
		    System.out.println("Enter number: ");
				num = sc.nextInt();
		    sum = sum + num;
		  
		  }
		  
		  
		  System.out.println("sum = " + sum);

	}

}
