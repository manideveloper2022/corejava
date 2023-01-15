package Oppsmethod;



/*
 
  Req:
  create 3 person objs
  set data
  display data


approch 3 for Testperson.java


 */


public class Testperson2 {

	public static void main(String[] args) {
		    
		    Person1 p1 =  getPersonObj(2010, "user1", 30);		
				
		    Person1 p2 =  getPersonObj(1001, "user2", 31);		
		 
			  Person1 p3 =  getPersonObj(1002, "user3", 32);		
		 
		 
				
				
				show(p1);
				show(p2);
				show(p3);
			}
	
	//function that takes obj as input arg
		private static void show(Person1 Pobj) {
			System.out.println(Pobj.id);
			System.out.println(Pobj.name);
			System.out.println(Pobj.age);
		}

		  		  
			//function that returns the object
			public static Person1 getPersonObj( int id1,	String name1, int age1){
		  	Person1 obj = new Person1();
		    
		    obj.id= id1;
				obj.name=name1;
				obj.age=age1;
		    
		    return obj;
		  }
		  
		  
		  
		  }
