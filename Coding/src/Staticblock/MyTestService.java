package Staticblock;
public class MyTestService {
	public static void main(String[] args) {
		MyService s1 = new MyService("oracle");//static block and constructr are executed
		MyService s2 = new MyService("sql");//only constructr is executed
		MyService s3 = new MyService("hana");//only constructr is executed
	
	
	}
}