package collectionDemo;

import java.util.ArrayList;

public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("Abhishek");
		al.add(null);
		al.add(10);
		al.add(22.2);
		al.add("Abhishek");
		al.add("sawai");		
		al.remove(2);		
		System.out.println(al);
		System.out.println(al.toString());
		
	}

}
