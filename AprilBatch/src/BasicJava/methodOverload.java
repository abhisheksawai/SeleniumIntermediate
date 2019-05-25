package BasicJava;

public class methodOverload {

	public void addition(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("two parameter");
		System.out.println("addition is " +c);
	}
	
	public int addition(int x, int y, int z)
	{
		int sum;
		sum=x+y+z;
		System.out.println("three parameter");
		return sum;
	}
	
	public int addition(int a)
	{
		a=a+a;
		System.out.println("one para");
		return a;
	}
	
		
	public static void main(String[] args) {
		
		methodOverload mo = new methodOverload();
		
		mo.addition(100);
		mo.addition(10, 20);
		int ekvaribale=mo.addition(20, 40, 60);
		
		System.out.println(ekvaribale);
		
		
		
		parent.checkstatic();
		

	}

}
