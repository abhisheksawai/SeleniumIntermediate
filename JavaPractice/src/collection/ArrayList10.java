package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList10 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add("abhishek");
		al.add("abhi");
		al.add("ab");
		
		//read the data by using iterator - normal vesion
		Iterator itrr = al.iterator();
		while(itrr.hasNext())
		{
			String s = (String)itrr.next();
			System.out.println(s);
		}
		System.out.println("------------");
		
		//read the data by using iterator - generics vesion
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext())
		{   
			String s =itr1.next();
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
