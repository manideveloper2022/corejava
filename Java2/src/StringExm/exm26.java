package StringExm;

public class exm26 {

	public static void main(String[] args) {
		
		
		// when multiple data is appended to a string seperated by delimitor then split() method
		String inputStr ="mualidhar#23#2334566#bncpk97404";
	  
		String[] data1 = inputStr.split("#");  // retuns an array
	    
	    System.out.println(data1[3]);
		System.out.println(data1[0]);
		System.out.println(data1[1]);
		System.out.println(data1[2]);
		
		
		
		
	}
	
	
}
