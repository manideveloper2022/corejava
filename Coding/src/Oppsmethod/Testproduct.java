package Oppsmethod;


/*
  
Hold the data of product
product ID 
product name 
product Category
product price 
 
 */

public class Testproduct {

	public static void main(String[] args) {


		Products p1 = new Products();
		p1.id= 101;
		p1.name = "Milk";
		p1.catogry= "Dairy suplies";
		p1.price=  26.56f;
		
		Products p2 = new Products();
		p2.id= 144;
		p2.name = "Vim";
		p2.catogry= "Home suplies";
		p2.price= 10;
		
		Products p3 = new Products();
		p3.id= 154;
		p3.name = "Pan";
		p3.catogry= "Kitchen suplies";
		p3.price= 798.55f;
		
		
		show(p1);
    	
		show(p2);
    	
		show(p3);


}

private static void show(Products Pobj) {
  
	System.out.println(Pobj.id);
	System.out.println(Pobj.name);
	System.out.println(Pobj.catogry);
	System.out.println(Pobj.price);
	
}


}
