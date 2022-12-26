package YTex;//Method overloading

public class exm10 {

	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	static double add(double a, double b, double c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(12,13,14));
		System.out.println(add(12.5,13.1,14.6));
		System.out.println(add(20,34));
		
	}
	
}
