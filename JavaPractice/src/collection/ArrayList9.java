package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList9 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add(50);
		al.add(70);
		al.add(10);
		
		System.out.println("print al");
		System.out.println(al);
		
		ArrayList al2 = new ArrayList(al);
		al2.add("al2 element1");
		ArrayList al3 = new ArrayList();
		al3.add("al3 element1");
		al3.addAll(al2);
		System.out.println("print al2");
		System.out.println(al2);
		System.out.println("print al3");
		System.out.println(al3);
		
		//al3.sort();
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
