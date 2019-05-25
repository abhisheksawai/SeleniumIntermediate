package Autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoit {

	public static void main(String[] args) throws IOException 
	{
		//System.setProperty("webdriver.chrome.driver","E:\\Supporting Jars\\nEcEsSoRyJaRfiLeS\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinypic.com/");
		//input[@id="the_file"]
		 driver.findElement(By.xpath("//*[@id=\'the_file\']")).click();
		 
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		// Runtime.getRuntime().exec("E:\\AutoIT\\autoiteditor");
		 Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\Notes April\\fileupload");
		 
		 
	}

}
