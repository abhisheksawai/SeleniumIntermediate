package arrays;

public class testEmpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emp e1 = new emp(11, "abhishek");
		emp e2 = new emp(12, "abhi");
		emp e3 = new emp(13, "abhijeet");
		
		emp[] e = new emp[5];
		
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
		
		for(emp ee:e)
		{
			System.out.println(ee.eid);
			System.out.println(ee.name);
		}
		
		
		
	}

}
