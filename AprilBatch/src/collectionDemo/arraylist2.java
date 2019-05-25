package collectionDemo;

import java.util.ArrayList;

public class arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList as = new ArrayList();
		//ArrayList als = new ArrayList();
		as.add(new stud(100,"abhishek"));
		as.add(new stud(101,"sachin"));
		//as.add(new stud(102,"akash"));
		
		as.add("sepreateadd");
//		al.add(null);
//		al.add(10);
//		al.add(22.2);
//		al.add("Abhishek");
//		al.add("sawai");		
//		al.remove(2);		
		System.out.println(as);
		
		for(Object a : as)
		{
		    stud s = (stud)a;
			//System.out.println(((stud)a).sroll);
			//System.out.println(((stud)a).sname);
			System.out.println("---");
			System.out.println(s.sroll);
			System.out.println(s.sname);
		}
		
		
		System.out.println(as);
			
	}

}
