package BasicJava;

public class Students {

	int id;
	String name;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s = new Students();
		s.id = 10;
		s.name = "abhi";
		
		Students s1 = new Students();
		s1.id = 102;
		
		//s1.name = "abhishek";
		System.out.println(s.id);
		System.out.println(s.name);
		
		System.out.println(s1.id);
		//System.out.println(s1.name);
		
	}

}
