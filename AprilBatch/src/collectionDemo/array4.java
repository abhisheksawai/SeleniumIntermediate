package collectionDemo;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emp e1= new emp(100, "balaji");
		emp e2= new emp(101, "abhishek");
		emp e3= new emp(102, "sachin");
			
		//int a[] = new int[5];
		
		emp emparry[] = new emp[3];
		
		emparry[0] = e1;
		emparry[1] = e2;
		emparry[2] = e3;
		
		//System.out.println(emparry.toString());
		
		for( Object barray :  emparry)
		{
			System.out.println(barray);
			
			//System.out.println(barray.toString());
			
			
			//System.out.println(barray.eid);
			//System.out.println(barray.ename);
			
		}
		
	}

}
