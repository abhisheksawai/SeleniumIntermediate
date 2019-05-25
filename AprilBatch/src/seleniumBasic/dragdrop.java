package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.get("http://jqueryui.com/demos/droppable/");
		
		driver.switchTo().frame(0);
		
		// find the element which needs to be dragged
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		//find the element which needs to be dropped
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		//using Actions clas
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();

	}

}
