package InheritanceDemo;

public class homeloan extends loan {

	{
		System.out.println("home timepass block");
	}
	
	public homeloan()
	{
		System.out.println("homeloan constr");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		homeloan hl = new homeloan();
		homeloan h2 = new homeloan();
		
		
	}

}
