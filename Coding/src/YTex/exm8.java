package YTex;//call by value exm

public class exm8 {

	int a;
	int b;
	
	private static void add(int s, int t)
	
	{
		s=10;
		System.out.println("Result from method: "+(s+t));
	}
	
	public static void main(String[] args) {
	
		exm8 op=new exm8(); 
		op.a=2;op.b=3;
		System.out.println("Before passing"+(op.a+op.b));
		add(op.a,op.b);
		System.out.println("After passing"+(op.a+op.b));
	 
	}
	
}