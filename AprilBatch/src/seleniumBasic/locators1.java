package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		//WebDriver driver = new WebDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		//browser launch zal
		driver.get("https://www.facebook.com/");
		
		//browser launch kel ki 5 second thambnar
		Thread.sleep(5000);  //milisecond
		
		//username enter karnar
		//driver.findElement(By.className("inputtext")).sendKeys("9403115588");
		
		//passwrod enter karnar
		//driver.findElement(By.tagName("input")).sendKeys("pass@1234");
		
		//working
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhishek@sawai");
	
		
		
		
		
	}

}
