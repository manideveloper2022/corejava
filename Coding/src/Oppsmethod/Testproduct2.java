package Oppsmethod;


public class Testproduct2 {

	public static void main(String[] args) {
		    
		    Products p1 =  getProductsObj(101,"Curd", "Dairy Suplies", 26.56f);		
		    Products p2 =  getProductsObj(144, "Rin", "Home Suplies ",10);		 
			Products p3 =  getProductsObj(154, "Stove", "Kitchen Suplies", 12799.87f);		
		 
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

			public static Products getProductsObj( int id,	String name, String catogry, float price){
		  	Products obj = new Products();
		    
		    obj.id= id;
				obj.name=name;
				obj.catogry=catogry;
		        obj.price=price;
				
		    return obj;
		  }
		  
		  
		  
		  }
