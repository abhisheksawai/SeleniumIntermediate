package seleniumBasic;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class winhandle2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asawai\\Documents\\Selenium Jars\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/popup.php");
			//click here ch xpath
			driver.findElement(By.xpath("/html/body/p/a")).click();
			
			
			
			
			Set<String> sets = driver.getWindowHandles();		
			Iterator<String> win1 =sets.iterator();
			String Parentwin = win1.next();//get the parent window ID		
			String childwin = win1.next();//get the Child window ID
		
			
			
		    driver.switchTo().window(childwin); //Switched to Child window
			Thread.sleep(10000);
			//Perform some action on Child window
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("Abhishek@anyweb.com");
			Thread.sleep(10000);
			driver.switchTo().window(Parentwin); // switch back to the original window
			
			System.out.println(driver.findElement(By.xpath("/html/body/div[2]/h2")).getText());

	}

}
