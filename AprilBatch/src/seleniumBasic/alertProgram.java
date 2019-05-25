package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//try to sign in without entering password

		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("John"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();

	}

}
