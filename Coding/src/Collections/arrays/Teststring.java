package Collections.arrays;
public class Teststring {
	public static void main(String[] args) {
		String [] s = new String[6];
		s[0]="mani";
		s[1]="mural";
		s[2]="shanvi";
		s[3]="sahasra";
		s[4]="rishik";
		s[5]="vamsi";
		System.out.println("*-*-*-*-*-*-*-*-*-*----Read by position----*-*-*-*-*-*-*-*-*-*");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		System.out.println("*-*-*-*-*-*-*-*-*-*----Read All----*-*-*-*-*-*-*-*-*-*");
		for (String x:s) {
		System.out.println(x);
		}
	}
}
