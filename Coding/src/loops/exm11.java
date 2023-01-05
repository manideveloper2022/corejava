package loops;

import java.util.Scanner;

public class exm11 {
	
	
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter number: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print (j);
			}
			System.out.println();
		}
	
}	
}

/*
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter number: ");
        int input = scn.nextInt();
        int rev = 1;
        for(int i = 1; i <=input; i++){
            int num = input;
            for(int j = 1; j <= rev; j++){
                System.out.print(num  + " ");
                num--;
            }
            rev++;
 
            System.out.println();
        }
  
    }

}
*/