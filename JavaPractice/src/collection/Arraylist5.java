package collection;

import java.util.ArrayList;

public class Arraylist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(new Student(100, "abhishek"));
		al.add(new Student(101, "abhijeet"));
		al.add("sawai");
		al.add(10);
		al.add(null);
		
		System.out.println(al);
		
		for(Object a:al)
		{
			if(a instanceof Student)
			{
				Student s = (Student)a;
				
				System.out.println(((Student) a).rollno);
				System.out.println(((Student) a).name);
			}
			
			System.out.println(a);
			
		}
	}

}
