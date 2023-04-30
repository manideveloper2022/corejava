package Collections.arrays;
public class Testsfloat {
	public static void main(String[] args) {
		float [] f = new float[6];
		f[0]=10.11f;
		f[1]=11.12f;
		f[2]=12.13f;
		f[3]=13.14f;
		f[4]=14.15f;
		f[5]=15.16f;
		System.out.println("*-*-*-*-*-*-*-*-*-*----Read by position----*-*-*-*-*-*-*-*-*-*");
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);
		System.out.println(f[4]);
		System.out.println(f[5]);
		System.out.println("*-*-*-*-*-*-*-*-*-*----Read All----*-*-*-*-*-*-*-*-*-*");
		for (float x:f) {
			System.out.println(x);
		}
	}

}
