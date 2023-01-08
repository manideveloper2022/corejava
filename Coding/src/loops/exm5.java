package loops;


/*
1.take the input for a number
2.find the even numbers from 1 till the input
*/

import java.util.Scanner;

public class exm5 {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ::");
		int input = sc.nextInt();
		
		
		//approch1
		for(int i=1;i<=input ; i++) {
			if( i%2 ==0 ) {
				System.out.println(i);
			}
		}
		
		/*approch2
		for( int i= 2; i<=input  ; i= i+2) {
			System.out.println(i);
		}*/
		

	}

}
