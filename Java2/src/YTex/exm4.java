package YTex;//example by using object in java program

public class exm4 {

	static void wheels()
	{
		
		System.out.println("Bike has 2 wheels");
		
	}
	
	String color="";
	static void braking()
	{
		
		System.out.println("bike halts when brakes applied");
		
	}
	
	void mileage(int s)
	{
		
		System.out.println("Bike mileage is "+s +"Kmpl");
		
	}
	
	public static void main(String[] args) {
		
		
   		exm4 RE=new exm4();
   		exm4 FZ=new exm4();
   		exm4 CBZ=new exm4();
   		
   		
   		RE.wheels();
		FZ.wheels();
		CBZ.wheels();
   		
		
   	RE.color="Black";
   	FZ.color="Blue";
   	CBZ.color="Orange";
   		
   	System.out.println("Bike color is"+RE.color);
		System.out.println("Bike color is"+FZ.color);
		System.out.println("Bike color is"+CBZ.color);	
   	
		
		
		RE.braking();
		FZ.braking();
		CBZ.braking();
		
		
		RE.mileage(38);
		FZ.mileage(40);
		CBZ.mileage(35);
		
   		
	}
	
	
}
