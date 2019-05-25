package InheritanceDemo;

public class child extends PParent {	
//	int x=100;
//	int y=200;
	
	child()
	{
		this(100);
		
		//System.out.println();
	}
	
	child(int i)
	{
		System.out.println("caling this");
		System.out.println(i);
		//super.m10();
		// super(); compiled time created
		//System.out.println("child"+i);
	
	}
	
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//		System.out.println(super.a+super.b);
//		System.out.println(this.x+this.y);
//		System.out.println(super.a+super.b);
//		System.out.println(x+y);
//	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child(10);
		child d = new child();
		
		//c.add(1000, 2000);
			
	}

}
