package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fewActions3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("printing text of forgpt account");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).getText());
		System.out.println("submit ch gettext");
		System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).getText());
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(by.l)
		driver.navigate().back();
		
		driver.navigate().forward();
		
							
		
		
//		driver.get("https://www.facebook.com/");
//		//username enter karat ahe
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
//		
//		//System.out.println(driver.findElement(By.xpath("//input[@type='email']")).getAttribute("id"));
//		
//		driver.findElement(By.xpath("//input[@id='email']")).clear();
	}

}
