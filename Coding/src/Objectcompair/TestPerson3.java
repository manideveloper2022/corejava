package Objectcompair;

/*
How to compare two objects?
----------------------------------
steps:
1.provide equals() method in Person.java
2. use p1.equals(p2)  or p2.equals(p1) for comparing two objs
 */

public class TestPerson3 {
	
	public static void main(String[] args) {
		Person p1 = new Person(20001,"user1" ,30 );
		Person p2 = new Person(20001,"user1",30 );

		if (p1.id == p2.id && p1.name.equals(p2.name) && p1.age==p2.age) {
			System.out.println("objs are equal");
		} else {
			System.out.println("objs not equal");
		}
	}
}

