package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('horus-querytext').value='Pune'");

	}
}
