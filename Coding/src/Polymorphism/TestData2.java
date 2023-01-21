package Polymorphism;

/*

if a method expects long , then the method can be called by passing int or long

if a method expects float , then the method can be called by passing int or float
  
if a method expects double  , then the method can be called by passing int or float  or long or double   

*/


public class TestData2 {
	public static void main(String[] args) {
		//create obj
		Data1 data = new Data1();
		
		
		float a2 = data.add(12.76f, 13.66f);// float, float
		System.out.println(a2);
		
		float a1 = data.add(4, 5);//int, int
		System.out.println(a1);
		
		
		float a3 = data.add(13131313L,42424242L);
		System.out.println(a3);
	}
}