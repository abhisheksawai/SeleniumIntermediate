package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Select s = new Select(day);
		s.selectByIndex(7);
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select smonth = new Select(month);
		smonth.selectByValue("3");
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select syear = new Select(year);
		syear.selectByVisibleText("1992");
	}

}
