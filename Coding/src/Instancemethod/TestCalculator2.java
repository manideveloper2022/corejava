package Instancemethod;



public class TestCalculator2 {
public static void main(String[] args) {
System.out.println("**** obj operations *****");
// create object
	Calculator2 c1 = new Calculator2();

	// set the data
	c1.n1 = 20;
	c1.n2 = 10;

	
	c1.sum();
	c1.mul();
	c1.div();
	c1.sub();
	
	
	Calculator2 c2 = new Calculator2();
	
	c2.n1 = 5;
	c2.n2 = 4;
	
	c2.sum();
	c2.mul();
	c2.div();
	c2.sub();
	
	
}
}