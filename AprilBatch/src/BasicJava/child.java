package BasicJava;

public class child  {

	public void job()
	{
		System.out.println("milel to karel");
	}
	
	public void shadi()
	{
		System.out.println("to gf");
	}
	
	public void checkstatic()
	{
		System.out.println("this is static method from parent");
	}
	
	public static void main(String[] args) {
		
		child c = new child();
		parent p = new parent();
		
		c.job();
		c.shadi();
//		c.property();
		p.shadi();
		
		

	}

}
