package collectionDemo;

public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{14,23},{15,24},{61,25},{17,26}};
		
//		int a[][] = new int[2][2];
//		
//		a[0][0]=10;
//		a[0][1]=11;
//		a[1][0]=12;
//		a[1][1]=13;
		
	
		
		
		for(int i = 0; i<=3 ; i ++) //row
		{
			for(int j =0 ; j <=1 ; j++) // col
			{
					
			System.out.println(a[i][j]);}
		}
		
	}

}
