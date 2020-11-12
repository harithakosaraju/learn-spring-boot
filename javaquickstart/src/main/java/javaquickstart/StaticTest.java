package javaquickstart;

public class StaticTest {

	public static void main(String args[]) {
		Parent p = new Child();
		p.name();
		p.print();
		Parent p1 = new Parent();
		p1.print();
		Child c = new Child();
		c.name();
		c.print();
	}
}

class Parent{
	public static void name() {
		System.out.println("Testing Parent");
	}
	protected void print( ) {
		System.out.println("Printing Parent");
		type();
	}
	private void type() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public static void name() {
		System.out.println("Testing child");
	}
	//In child class we cannot decrease visibility
	public void print( ) {
		System.out.println("Printing Child");
		type();
	}
	private void type() {
		System.out.println("Child");
	}
}