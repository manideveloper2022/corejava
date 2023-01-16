package methods.passvalues;


// if method1() calls method2() by passing obj , if the method2() is modifying obj ,
//then it will have impact on method1()


public class TestPassByRef {
	public static void main(String[] args) {
		//create obj
		Person p1 = new Person();// new obj created for p1
		
		//set data
		p1.id= 2001;
		p1.name= "user1";
		p1.age =29;
		
		System.out.println("before call");
    p1.display();
    
    
    
		//pass obj to the modify method
		modify(p1);  
		 
    
    System.out.println("after call");
		 p1.display();
     
     }

	public static void modify(Person pObj){ 
		pObj.id= 4000;
		pObj.name= "user11";
		pObj.age =45;
	}
     
}




