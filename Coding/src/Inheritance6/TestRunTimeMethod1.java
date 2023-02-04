package Inheritance6;
public class TestRunTimeMethod1 {
 public static void main(String[] args) {
		 
			Hdfc h = new Hdfc();
			execute(h);
			
			SBI s = new SBI();
			execute(s);
			
			Icici i = new Icici();
			execute(i);
			
			RBI r = new RBI();
			execute(r);
	}
  
	private static void execute(RBI r) {
		r.createAcc();
		r.processLoan(); 
	}
  
}