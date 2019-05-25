package collectionDemo;

public class array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp e1= new emp(100, "balaji");
		emp e2= new emp(101, "abhishek");
		emp e3= new emp(102, "sachin");
		
			
		//int a[] = new int[5];
		
		emp emparry[] = new emp[5];
		
		emparry[0] = e1;
		emparry[2] = e2;
		emparry[4] = e3;
		
		//System.out.println(emparry.toString());
		
		for( emp barray :  emparry)
		{
			//System.out.println(barray);
			//System.out.println(barray.toString());
			System.out.println(barray.eid);
			System.out.println(barray.ename);
		}
		
	}

}
