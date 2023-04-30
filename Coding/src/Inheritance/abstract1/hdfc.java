package Inheritance.abstract1;

/*
For Hdfc overriding the createPPF() method is mandatory.
if Hdfc doesnt override , we will get compilation.

*/

public class hdfc extends RBI{

	public void createPPF(){
		System.out.println("HDFCBank:: createPPF completed");
	}
	
	

}
