package collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(new Student(100, "abhishek"));
		al.add(new Student(101, "abhijeet"));
		al.add("sawai");
		al.add(10);
		al.add(null);
		
		System.out.println(al.get(3));
	}

}
