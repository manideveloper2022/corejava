package Inheritance.abstract2;

public class icici extends RBI{

	

	@Override
	public void createAccount() {
		System.out.println("Worldbank :: Created account");
		
	}

	@Override
	public void getkyc() {
		System.out.println("Worldbank :: KYC Completed");
		
	}

	@Override
	public void createppf() {
		System.out.println("RBIbank :: Createppf Completed");
		
	}	
}
