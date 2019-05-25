package collectionDemo;

import java.util.ArrayList;

public class arraylist9 {

	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		ArrayList al3 = new ArrayList();	
		al3.add("al3 one");
		al3.add("al3 two");
		al3.add("al3 three");
		
		ArrayList al1 = new ArrayList();		
		al1.addAll(al);		
		//System.out.println(al1);		
		al1.addAll(al3);	
		System.out.println(al1);	
		
		
		ArrayList al2 = new ArrayList(al);
		//System.out.println(al2);
		
	}}
