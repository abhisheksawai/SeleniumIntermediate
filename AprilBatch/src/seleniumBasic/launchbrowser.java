package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		//WebDriver driver = new WebDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		//browser launch zal
		driver.get("https://www.facebook.com/");
		
		//username enter karnar
		driver.findElement(By.name("email")).sendKeys("9403115588");
		
		//passwrod enter karnar
		driver.findElement(By.name("pass")).sendKeys("password@1234");
		
	
		
	
		
		
		
		
	}

}
