package collectionDemo;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[]= {11,22,33,44,55};
		
		//int a[] = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
	
		 System.out.println(a.length);
		
		for(int i=0;i<=a.length-1; i++)
		{
			System.out.println(a[i]);
			//System.out.println(i);
		}
		
		System.out.println("print in for each loop");
		for(int myarray  : a )
		{
			System.out.println(myarray);
		}
		
		
	}

}
