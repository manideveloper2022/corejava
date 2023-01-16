package methods.passvalues;

public class TestPassByValue {
	public static void main(String[] args) {
		int x= 10;
		
		System.out.println(x); 
		
		modify(x);
		
		System.out.println(x); 
	}
	
	
	private static void modify(int num){ 
		num = 90;
	}
	
}
/*
// if method1() calls method2() by passing primitive variables [int/float/long/double.etc..] 
	 //if the method2() is modifying primitive variable , then it will not have impact on method1()

*/