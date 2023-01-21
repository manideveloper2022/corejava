package Polymorphism;

public class TestCalculator {
	
	
public static void main(String[] args) {
		
		//create obj
		Calculator cal = new Calculator();
    
		System.out.println(" // no of args ");
		
    	int sum1=cal.add(5,6); // pass two ints
    System.out.println(sum1);
    
    
    	int sum2 = cal.add(1,2,3);// pass 3 ints
		System.out.println(sum2);
		
		System.out.println(" //data type of args ");
    
    long sum3 = cal.add(123123l, 321654l);
    		System.out.println(sum3);
    
    float sum4 = cal.add(23.12f, 16.88f);
          System.out.println(sum4);
    
    System.out.println(" //order of args ");
          
    cal.add(12, 28.00f);
    cal.add(12.18f, 12);
          
    }
    
    
}
