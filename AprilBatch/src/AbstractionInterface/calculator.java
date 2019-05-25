package AbstractionInterface;

import InheritanceDemo.ROI;
import InheritanceDemo.animal;

public abstract class calculator extends animal implements  ROI  {

	public abstract void add();
	
	
	public abstract void sub();
	
	void mul()
	{
		System.out.println("multiplication");
	}
}
