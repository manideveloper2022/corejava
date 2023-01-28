package Staticmethod;

public class Dao1 {

	//static variable
	static int count =900;
	
	//static method - to print static value
	public static void showCount(){
		System.out.println(count);
	}
	
	//static method - alter static variable
	public static void updateCount(int increment){
		count= count+ increment;
		 System.out.println(Dao1.count);
	}
	
}
