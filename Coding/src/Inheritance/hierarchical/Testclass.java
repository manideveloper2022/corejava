package Inheritance.hierarchical;
public class Testclass {
	public static void main(String[] args) {
		
		RBIBank r = new RBIBank();
		Hdfc h = new Hdfc();
		Icici i = new Icici();
		SBI s = new SBI();
		
		System.out.println("=========RBI=======");
		
		r.createAccount();
		r.processLoan();
		
		System.out.println("=========HDFC=======");
		
		h.createAccount();
		h.processLoan();
		h.createPPF();
		
		System.out.println("=========ICICI=======");
		
		i.createAccount();
		i.processLoan();
		i.createPPF();
		
		System.out.println("=========SBI=======");
		
		s.createAccount();
		s.processLoan();
		s.createPPF();
		
	}

}
