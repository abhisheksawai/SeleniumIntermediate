package InheritanceDemo;

public class peacock  {
	
	void p1()
	{
		System.out.println("peacock -fly");
	}
	
	public static void main(String[] args) {
		
		peacock p = new peacock();
		animal a = new animal();
		a.a1();
		birds b = new birds();
		b.b1();
		
		//peacock p = new animal();
	
		
		
		p.a1();
		p.p1();
		
		birds b = new birds();
		b.b1();
		b.a1();
		
	}
}
