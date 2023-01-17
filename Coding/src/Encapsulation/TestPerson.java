package Encapsulation;

public class TestPerson {

	public static void main(String[] args) {


	Person p = new Person();
	
	//p.id = 25;
	p.setId(25);
	
	//p.name = "manii";
	p.setName("mani");
	
	//p.age = 16;
	p.setAge(26);
	
	System.out.println(p.getId());
	System.out.println(p.getName());
	System.out.println(p.getAge());

	}

}
