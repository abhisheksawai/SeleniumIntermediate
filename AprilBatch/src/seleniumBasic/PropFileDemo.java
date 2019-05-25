package seleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropFileDemo {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		File src=new File("E:\\World Of Program\\AprilBatch\\src\\seleniumBasic\\OR.properties");
		// Create FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		// Create Properties class object to read properties file
		Properties pro=new Properties();
		// Load file so we can use into our script
		pro.load(fis);
		
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
			
	Thread.sleep(3000);
	//click on login
	//driver.findElement(By.xpath("//*[@id=\'app\']/div/div[2]/div[2]/div[3]/div[4]/div")).click();
	driver.findElement(By.xpath(pro.getProperty("txt_uname_paytm"))).click();
	//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")));
	//driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
	
	}

}
