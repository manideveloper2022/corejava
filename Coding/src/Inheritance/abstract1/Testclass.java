package Inheritance.abstract1;
public class Testclass {
	public static void main(String[] args) {
		hdfc h = new hdfc();
		h.createAccount();
		h.processLoan();
		h.createPPF();
		System.out.println("==============");
		RBI r = new hdfc();
		r.createAccount();
		r.processLoan();
		r.createPPF();
		
	}
}
