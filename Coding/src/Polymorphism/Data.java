package Polymorphism;

/* In the Data class we have two methods with same method 
name as Save and one has person as input arguments and other
has string as input arguments*/


public class Data {
	
	public void save(Person p){
		System.out.println("save person");
	}
	
	public void save(String str){
		System.out.println("save string");
	}
	
}