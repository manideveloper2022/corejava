package YTex;//this keyword example

 

public class exm12 {
 
	String n;//declaration
	exm12(String n)//constructor
	{
		this.n=n;
	}
	void display() //method
	{
		this.display1();
		System.out.println("Example of this key word " +n);
	}
	void display1() //method
	{
		
		System.out.println("hii");
	}
	
	public static void main(String[] args) {
		
		exm12 t=new exm12("THIS");
		t.display();
		
		
	}
	
}
