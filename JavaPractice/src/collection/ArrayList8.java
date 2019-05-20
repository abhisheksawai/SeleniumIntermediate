package collection;

import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("abhishek");
		al.add(10);
		al.add(20.2);
		System.out.println(al);
		System.out.println(al.toString());
		
		al.add(1,"sawai");
		
		System.out.println(al);
	
		al.remove(2);
		System.out.println(al);

	}

}
