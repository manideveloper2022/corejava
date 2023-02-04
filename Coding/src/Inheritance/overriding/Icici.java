package Inheritance.overriding;
public class Icici extends RBIBank{
	
	public void createPPF(){
		System.out.println("Icici:: createed ppf");
	}
  
  public  void processLoan(){
		super.processLoan(); // call the parent method from the child method
		System.out.println("ICICI:: Additional charge of Rs.2000");
	}
}