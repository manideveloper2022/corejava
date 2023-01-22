package loops;
/*

Enter any number ::
5

op.

1
2
3
4
5

*/
import java.util.Scanner;

public class printnum1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter any number ::");
		int input = sc.nextInt();

		
		for( int i= 1; i<=input  ; i= i+1) {
			System.out.println(i);
		}
		
		
	}

}
