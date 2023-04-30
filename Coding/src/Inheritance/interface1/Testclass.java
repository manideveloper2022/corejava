package Inheritance.interface1;

public class Testclass {
	
	public static void main(String[] args) {
		
		
		icici i = new icici();
		i.createAccount();i.getKYC();i.createPPF();
		System.out.println("================== ");
		RBI r = new icici();
		r.createAccount();r.getKYC();r.createPPF();
		
		
	}
	

}
