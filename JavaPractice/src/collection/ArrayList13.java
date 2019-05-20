package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList13 {

	public static void main(String[] args) {
	
		ArrayList<book> alb = new ArrayList<book>();
		alb.add(new book (111,"c","abhishek"));
		alb.add(new book (121,"cpp","abhi"));
		alb.add(new book (131,"clanuange","ab"));
	
		for(book bb : alb)
		{
			System.out.println(bb.id+ " "+bb.author+" " +bb.name);
		}		
		Iterator<book> it = alb.iterator();	
		while(it.hasNext())
		{
			book b = it.next();
			if(b.id==111)
			it.remove();
			
			if(b.author.equals("ab"))
			it.remove();
			
		}				
		//print the remaining data
		System.out.println("------");
		for(book bb : alb)
		{
			System.out.println(bb.id+ " "+bb.author+" " +bb.name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Iterator<book> it1 = alb.iterator();
//		while(it1.hasNext())
//		{
//			book b = it1.next();
//			System.out.println("------");
//			System.out.println("name is "+b.name+" ,id is "+b.id+" ,author is "+b.author);
//		}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
//		Iterator itr = al.iterator(); 
//		while(itr.hasNext())
//		{
//			itr.next();
//			System.out.println(al);
//		}
//		System.out.println("--------");
	
	
	
	}

}
