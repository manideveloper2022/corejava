package Inheritance.multilevel;
public class Testclass {
	public static void main(String[] args) {
		Person p = new Person(501, "mani", 26);
		Employee e = new Employee(502, "murali", 30, "hask45784a", "uan1424571");
		Staff s= new Staff(503, "rani", 43, "hashj4566", "uan2165", "145242", "556541");
		p.displayPerson();
		e.displayEmp();
		s.displayStaff();
	}

}
