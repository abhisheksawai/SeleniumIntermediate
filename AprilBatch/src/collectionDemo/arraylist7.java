package collectionDemo;

import java.util.ArrayList;

public class arraylist7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		//al.add(10,"abhishek");
		al.add(22.2);
		//al.add("Abhishek");
		al.add("sawai");		
		al.remove(2);		
		al.remove("Abhishek");
		System.out.println(al);
		System.out.println(al.toString());
		
	}}
