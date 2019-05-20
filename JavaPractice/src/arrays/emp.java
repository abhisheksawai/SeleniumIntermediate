package arrays;

public class emp {
	
	 int eid;
	 String name;
	 
	 emp(int eid, String name) //local variable
	 { // conversion of local to instance
		 this.eid=eid;
		 this.name=name;
	 }

	 
	 public static void main(String[] args) {
		emp e = new emp(100, "abhi");
		
		System.out.println(e instanceof emp);
	}


}
