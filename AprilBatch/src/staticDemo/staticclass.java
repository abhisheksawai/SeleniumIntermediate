package staticDemo;

import InheritanceDemo.homeloan;

public class staticclass {

	
	staticclass ha = new staticclass();
	int normal;
	
	static int statvaribale;
	
	static int count =0;
	staticclass()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		statvaribale = 100;
		normal=10;
		staticclass s1 = new staticclass();	
		staticclass s2 = new staticclass();	
		staticclass s3 = new staticclass();	
		

	}

}
