package Inheritance.runtime;
public class Hdfc extends RBI{

	//overriding method
	public void processLoan() {
		System.out.println("HDFC: 12%");
	}
	
	public void demat() {
		System.out.println("HDFC: demat 13%");
	}
}