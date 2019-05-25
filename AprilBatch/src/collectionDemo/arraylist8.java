package collectionDemo;

import java.util.ArrayList;

public class arraylist8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		System.out.println(al.get(2));
		al.set(2, "newele");
		//System.out.println(al.get(one));
		System.out.println("index of"+(al.indexOf("two")));
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al.isEmpty());
		
		
	}}
