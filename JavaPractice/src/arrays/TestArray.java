package arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {10,20,30,40,50};
	//	int []b = new int [5];
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		for (int i=0;i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
	}

}
