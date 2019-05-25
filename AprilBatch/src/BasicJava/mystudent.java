package BasicJava;

public class mystudent {

	int a;
	String name;
	
	public void addition(int a, int b)
	{
			int add;
			add = a + b;
			System.out.println(add);
			return add;
	}

	public static void main(String[] args) {
		mystudent ms = new mystudent();
		mystudent ms1;
		
		
		int sum;
		sum=ms.addition(10, 20);
		System.out.println(sum);
		
		
		//s.insertrecord( 100,"abhishek");
		
		Students ss= new Students();
		
	}
	
}
