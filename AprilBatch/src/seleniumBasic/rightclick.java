package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightclick {
	
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://paytm.com/");
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
			
			
			Thread.sleep(3000);

			// Create object of Action class
			Actions action = new Actions(driver);
			 
			// Find element using locator and store into WebElement landline
			WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[1]/div/a[5]/div"));
			 
			action.moveToElement(element).build().perform();
			
		
			
			Thread.sleep(5000);
			// Perform Right click operation using action (object) on element using contextClick method.
			action.contextClick(element).perform();
			
			//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); 
			
			//WebDriverWait wait = new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=':jb']/div/div")));

			//JavascriptExecutor jse= (JavascriptExecutor) driver;
			//jse.executeScript("document.getElementById('horus-querytext').value='Pune'");

			
			}
}
