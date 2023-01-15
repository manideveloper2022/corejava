package Oppsmethod;



/*
 
  Req:
  create 3 person objs
  set data
  display data

 */


public class Testperson {

	public static void main(String[] args) {
		/* approch 1
		
		Person1 p1=new Person1();
		Person1 p2=new Person1();
		Person1 p3=new Person1();
		
		p1.id=123;
		p1.name="mani";
		p1.age=21;
		
		System.out.println("*******1st person data*******");
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.id);
		
		p2.id=456;
		p2.name="murali";
		p2.age=28;
		
		
		System.out.println("*******2nd person data*******");
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.id);
		
		
		p3.id=789;
		p3.name="manoj";
		p3.age=24;

		
		System.out.println("*******3rd person data*******");
		System.out.println(p3.id);
		System.out.println(p3.name);
		System.out.println(p3.id);
		
		*/
		
		/*
		 approach 2
		 */
		
		//create obj
				Person1 p1 = new Person1();
				p1.id= 1000;
				p1.name = "user1";
				p1.age= 30;
				
				Person1 p2 = new Person1();
				p2.id= 1001;
				p2.name = "user2";
				p2.age= 31;
				
				Person1 p3 = new Person1();
				p3.id= 1002;
				p3.name = "user3";
				p3.age= 32;
				
		  
				show(p1);
		    	
				show(p2);
		    	
				show(p3);
		
		
	}

	 private static void show(Person1 Pobj) {
		  
			System.out.println(Pobj.id);
			System.out.println(Pobj.name);
			System.out.println(Pobj.age);
		
	  }
	

}
