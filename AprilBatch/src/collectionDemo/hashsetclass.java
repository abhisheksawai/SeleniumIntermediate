package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetclass {

	public static void main(String[] args) {

	   ArrayList<String> list=new ArrayList<String>();  
	           list.add("Ravi");  
	           list.add("Vijay");
	           list.add("Vijay");
	           list.add("Ajay"); 
	           list.add(null);
	           
	           System.out.println(list);
	           System.out.println("---------");
	             
	           HashSet<String> set=new HashSet(list);  
	           set.add("Vijay");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	        	   System.out.println(i.next());  
               }  
	 }  

	}

