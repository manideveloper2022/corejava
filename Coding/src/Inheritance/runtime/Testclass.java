package Inheritance.runtime;

public class Testclass {

	
		
		public static void main(String[] args) {
			
			System.out.println("************[Approach1 ]Hdfc operations **************");
			Hdfc h = new Hdfc(); // create obj for child class and refer by child class
			h.createAcc();    //RBI
			h.processLoan(); //Hdfc 
			h.demat();   // Hdfc
			
			
			System.out.println("************[Approach2 ]Hdfc operations **************");
			RBI r = new Hdfc(); // create obj for child class and refer by parent class.[upcasting]
			r.createAcc(); // RBI
			r.processLoan(); // HDFC
			//r.demat(); // this gives compilation; cannot call child specific method

	}

}
