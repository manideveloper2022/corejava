package Inheritance.interface1;

public class icici implements RBI {

	@Override
	public void createAccount() {
		System.out.println("RBIbank :: Created account");
		
	}
	
	@Override
	public void getKYC() {
		System.out.println("RBIbank :: KYC Completed");
		
	}

	@Override
	public void createPPF() {
		System.out.println("RBIbank :: Createppf Completed");
		
		
	}
	
	
	
	
	}
