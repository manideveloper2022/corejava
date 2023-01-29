package Composition2;
// create empl with address


public class TestEmployeeWithAddress1 {
	public static void main(String[] args) {
  
  //create emp obj with data
		Employee emp1 = new Employee();
		emp1.setId(1236);
		emp1.setAge(29);
		emp1.setName("user1");
  
  
  //create addres obj with data
		Address localAdd1= new Address();
		localAdd1.setCity("chennai");
		localAdd1.setCountry("IN");
		localAdd1.setHno("56");
		localAdd1.setPin("560037");
		localAdd1.setState("TN");
		localAdd1.setStreetName("selam");
    
    
		//keep address obj inside employee obj
		emp1.setAddress(localAdd1);
    
    //print emp
    emp1.printPerson();
  
  //print address
  //  localAdd1.printAddr();
  
  Address addr =  emp1.getAddress();
  addr.printAddr();
  
  }
}