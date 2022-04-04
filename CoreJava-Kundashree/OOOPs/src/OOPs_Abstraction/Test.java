package OOPs_Abstraction;

public class Test {

	public static void main(String[] args) {
		// person p =new Person(); not allowed, coz it is abstract class
		// Polymorphism implementation
		Person p1 = new Employee();
		p1.doSomething();
		Person p2 = new Student();
		p2.doSomething();
		Person p3 = new HouseWife();
		p3.doSomething();
		
		
		Employee e = new Employee(); 
		// pure implementation
		e.doArt();
		e.doPlay();
		e.do1();
		//Interface concept
	}

}
