package collectionDemo;

import java.util.ArrayList;
import java.util.ListIterator;



public class arraylist11 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		ListIterator lst = al.listIterator();
	
		while(lst.hasNext())
		{
			String s = (String) lst.next();
			System.out.println(s);
		}
		
		while(lst.hasPrevious())
		{
			String s = (String) lst.previous();
			System.out.println(s);
		}
		

		
	}}
