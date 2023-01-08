package Oppsmethod;

public class operations {

	public void show() {
		System.out.println("inside show method");
	}

	public void car() {

		System.out.println("Merc Benz");

	}

	// method with string input
	public void process(String s) {
		String m = "Mr/Mrs " + s;
		System.out.println("res = " + m);

	}

	public void addten(int x) {

		x = x + 10;
		System.out.println("res = " + x);

	}

	public void sum(int x, int y) {

		int result = x + y;
		System.out.println("Sum = " + result);

	}

	public void math(int x, int y) {

		int sum = x + y;
		System.out.println("Add = " + sum);

		int min = x - y;
		System.out.println("Minus = " + min);

		int div = x / y;
		System.out.println("Division = " + div);

		int mul = x * y;
		System.out.println("Multiplication = " + mul);

	}

	public int getdata() {

		int x = 199;
		return x;

	}

	public String getword() {

		String s = "Hello world";
		return s;

	}

	public int add(int x, int y) {
		int res1 = x + y;
		return res1;

	}

	public int big(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	public int small(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
    public int min(int x, int y) {
		
    	int res3=x-y;
    	return res3;
    	
    }
    
    public int mul(int x, int y) {
    	int res4 = x*y;
    	return res4;
    }

	public int div(int x, int y) {
		int res5 = x/y;
		return res5;
	}
	public int bigof3(int x, int y, int z) {
		if (x>y && x>z) {
			return x;
		}else if(y>z){
			return y;
		}else {
			return z;
		}
	}
	public void table(int input) {
		for( int i=1; i<=10  ; i= i+1) {
			int res = input * i;
			System.out.println(  input + " * " + i +" = " +res);
			  
		}
	}

	 public int fact(int x) {
		 
		 int fact = 1;
		 for(int i=1; i<=x; i++) {
			 fact = i * fact;
		 }
		 return fact;
	 }
	 
	 public  void number(int x) {
		 
		 int number = 1;
		    for(int i = 1; i <= x; i++) {

		      for(int j = 1; j <= i; j++) {
		        System.out.print(number + " ");
		        number++;
		      }

		      System.out.println(); 
		    }
	 }
public  void numbers(int y) {
		 
	for (int i = 1; i <= y; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print (" " + j);
		}
		System.out.println();
	}
	 }
	
}