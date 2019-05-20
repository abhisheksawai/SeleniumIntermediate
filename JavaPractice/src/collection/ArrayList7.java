package collection;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		
		System.out.println(al);
		System.out.println(al.toString());
		
		al.add(1,"sawai");		
		System.out.println(al);	
		al.remove(2);
		System.out.println(al);
		al.set(2, "replaceitem");
		
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		al.clear();
		System.out.println(al.isEmpty());
		
		
		al.add(10);
		al.remove(10);
		System.out.println(al);
		
		

	}

}
