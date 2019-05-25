package InheritanceDemo;

public class C extends A implements B {

	public void m5() {System.out.println("child m 5");}
	
	public void m6() {
		super.m1();
		System.out.println("child m 6");}
	
	public void m1() {System.out.println("child   m 1");}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C cob = new C();
		A aob = new A();
		aob.m1();
		cob.m1();
		cob.m2();
		cob.m3();
		cob.m4();
		cob.m5();
		cob.m6();
	}

}
