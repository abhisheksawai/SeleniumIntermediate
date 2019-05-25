package InheritanceDemo;

public class B extends A {

	public void m3() {System.out.println("parent m 3");}
	public void m4() {System.out.println("parent m 4");}
	public void m1() {super.m1();
	System.out.println("parent  m 1");}
}
