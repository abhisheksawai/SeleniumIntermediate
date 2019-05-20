package StringDemo;

public class toCharArrayProg {
	
	static int d=10;

	public static void main(String[] args) {
		
		int x=10;
		
		String s1="hello";  
		char ch[]=s1.toCharArray();
		//System.out.println(ch.length);
		int len = ch.length;
		System.out.println(len);
		for(int i=0;i<ch.length;i++)
		{  
			System.out.print(ch[i]);  
		}  
		System.out.println("---------");
		for(int i=len-1;i>=0;i--)
		{  
			System.out.print(ch[i]);  
		} 
		
		}   
	}
