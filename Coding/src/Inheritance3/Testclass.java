package Inheritance3;
public class Testclass {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(201);
		p.setName("mani");
		p.setAge(26);
		Employee e= new Employee();
		e.setId(202);
		e.setName("murali");
		e.setAge(30);
		e.setPan("erkjs1985a");
		e.setPfno("uan1654118");
		System.out.println("=========PERSON DETAILS===========");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println("=========EMPLOYEE DETAILS===========");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getPan());
		System.out.println(e.getPfno());
	}
}
