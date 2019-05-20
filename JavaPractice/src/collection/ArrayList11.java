package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList11 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();		
		al.add("abhishek");
		al.add("abhi");
		al.add("ab");		
		//list iterator - normal vesion so type cast req for generic not req
		ListIterator lst = al.listIterator();
		while(lst.hasNext())
		{
			String s = (String)lst.next();
			System.out.println(s);
		}
		System.out.println("---------back-----");// how to go backword directin
		while(lst.hasPrevious())
		{
			String s = (String)lst.previous();
			System.out.println(s);
		}
		
		System.out.println("---  !! using geenerics     ---  !!");
		//list iterator - generic vesion so type cast req for generic not req
	
	
		ListIterator<String> lst2 = al.listIterator();
		while(lst2.hasNext())
		{
			String s = lst2.next();
			System.out.println(s);
		}
		System.out.println("---------back2-----");// how to go backword directin
		while(lst2.hasPrevious())
		{
			String s = lst2.previous();
			System.out.println(s);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		Iterator itr = al.iterator(); 
//		while(itr.hasNext())
//		{
//			itr.next();
//			System.out.println(al);
//		}
//		System.out.println("--------");
	
	
	
	}

}
