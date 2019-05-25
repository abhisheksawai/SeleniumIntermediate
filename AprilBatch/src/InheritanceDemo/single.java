package InheritanceDemo;

public class single extends A {
	
//	public void single1() 
//	{
//		System.out.println("single 1");
//	}	
	
	public void m1() //override keli parnet chi
	{
		System.out.println("child m1");
		
	}
	
	public void callparentmethod()
	{
		super.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				single s = new single();
				//s.single1();
				s.m1();
				s.callparentmethod();
				//s.m2();
				s.m4();
				
	}

}
