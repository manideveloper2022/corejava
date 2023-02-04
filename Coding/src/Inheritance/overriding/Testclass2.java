package Inheritance.overriding;

public class Testclass2 {

	public static void main(String[] args) {
		
		RBIBank r = new RBIBank();
		Icici i = new Icici();
		
		
		System.out.println("=======RBI Detailes=======");
		r.createAccount();
		r.processLoan();
		System.out.println("=======ICICI Detailes=======");
		i.createAccount();
		i.processLoan();
		i.createPPF();

	}

}
