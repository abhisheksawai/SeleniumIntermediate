package collectionDemo;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //int a[];
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//System.out.println(a[0]);
		System.out.println(a[1]);
		//System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("-----ff-------");
		
		for(int i=0;i<=4; i++)
		{
			System.out.println(a[i]);
			//System.out.println(i);
			
		}
		System.out.println("hotay ka reverse");
		for(int i=4;i>=0; i--)
		{
			System.out.println(a[i]);
			//System.out.println(i);
			
		}
		
		
		
	}

}
