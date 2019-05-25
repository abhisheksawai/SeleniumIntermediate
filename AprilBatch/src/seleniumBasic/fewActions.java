package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fewActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//username enter karat ahe
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		
		System.out.println(driver.findElement(By.xpath("//input[@type='email']")).getAttribute("id"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asa");
		
		driver.close();
		driver.quit();
		driver.disp
	}

}
