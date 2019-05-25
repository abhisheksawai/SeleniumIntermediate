package seleniumBasic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");		
		
		// Take screenshot and store as a file format             
				 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
				try {
					// now copy the  screenshot to desired location using copyFile method
		 					FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\Desktop\\Notes April\\test.png"));   
		 				
		          } 
				catch (Exception e) {
					// TODO: handle exception
				}
	}

}
