package YTex;//call by  reff exm

public class exm9 {
	int a;
	int b;
	
	private static void add (exm9 op, exm9 op1)
	{
		op.a=10;
		System.out.println("Result from method:" +(op.a+op.b));
	}
	
	public static void main(String[] args) {
		
		exm9 op=new exm9();
		exm9 op1=new exm9();
		op.a=2;op.b=3;
		System.out.println("BP: " +(op.a+op.b));
		add(op,op);
		System.out.println("AP: " +(op.a+op.b));
		
		
	}

}
