package Inheritance.runtime;
public class Testclass2 {


	public static void main(String[] args) {
		RBI r = new Hdfc();// create obj for HDFC and refer by RBI

		r.createAcc();
		r.processLoan();
System.out.println("=====================");
	 r = new Icici();
  
	 r.createAcc();
		r.processLoan();
		System.out.println("=====================");   
   r= new SBI() ;
  
   r.createAcc();
	r.processLoan();

}


}