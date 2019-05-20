package StringDemo;

public class reverse {

	public static void main(String[] args) {
		String name = "Abhishek stay in wagholi";
		System.out.println(name);
		
		//name.reverse();				
		 String words[]=name.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);
		        sb.reverse();
		        //System.out.println(sb.reverse());  
		        reverseWord+=sb.toString()+" ";  
		    }  	
		    System.out.println("Reverse string is -------");
		    System.out.println(reverseWord);		
		    //System.out.println(name);
	}

}
