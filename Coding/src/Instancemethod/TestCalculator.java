package Instancemethod;

public class TestCalculator {

	public static void main(String[] args) {


		Calculator c1 = new Calculator();
		
		int x = 5;
		int y = 4;
		
		c1.sum(x, y);
		c1.mul(x, y);
		c1.div(x, y);
		c1.sub(x, y);
	}

}
