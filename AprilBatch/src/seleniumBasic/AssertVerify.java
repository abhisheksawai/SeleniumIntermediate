package seleniumBasic;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssertVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","E:\\nEcEsSoRyJaRfiLeS\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
	    driver.manage().window().maximize();
	
	    //assertTrue(driver.getPageSource().contains("sanu"));
	    //System.out.println("done");
	    String expected = "Online bill payment";
	    String actual = driver.getTitle();
	    
	   Assert.assertEquals(actual, expected);
	   System.out.println("yes pass");
	

	   /* if(driver.getPageSource().contains("Paytm"))
 
	    {
 	    		System.out.println("Name is Present");
 	    	}
 	    else
 	    {
 	    		System.out.println("Name is not Present");
 	    	}
	    
	    driver.close();
	    }*/
	
	
	
	


	}
}

		
	


