package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList12 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList();		
		al.add("abhishek");
		al.add("abhi");
		al.add("ab");		
		System.out.println("before remove element"+al);
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			//System.out.println(s);
			if(s.equals("ab"))
			it.remove();
			//System.out.println("after remove of element");
			//System.out.println(s);
		}
		System.out.println("after remove element"+al);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		Iterator itr = al.iterator(); 
//		while(itr.hasNext())
//		{
//			itr.next();
//			System.out.println(al);
//		}
//		System.out.println("--------");
	
	
	
	}

}
