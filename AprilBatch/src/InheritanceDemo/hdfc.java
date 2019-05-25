package InheritanceDemo;

public class hdfc implements ROI {

	public void accountopen()
	{
		System.out.println("HDFC - saving account open");
	}
	
	public static void main(String[] args) {
		
		//hdfc hd = new hdfc();
		ROI hd = new hdfc();
		//ROI r = new ROI();
		//ROI r;
		
		hd.accountopen();
	
		hd.Homerateofint();
		hd.carrateofint();
		
		
	}

	public void Homerateofint() {
		System.out.println("10%");
	}

	public void carrateofint() {
		System.out.println("20%");
		
	}


	
	}

