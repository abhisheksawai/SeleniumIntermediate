package StringDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lnikedinconnect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek_sawai\\Documents\\all jars extracted\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/uas/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sawai.abhishek@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("link@1234");
		//click on singin
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		//click on my net
		driver.findElement(By.xpath("//*[@id=\"mynetwork-nav-item\"]/a")).click();
		
		Thread.sleep(2000);
		
		
		for(int i = 2; i <=100 ; i ++)
		{
			
			Thread.sleep(5000);
			//driver.findElement(By.xpath("(//button[@aria-label='Invite  to connect'])[2]")).click();	
			driver.findElement(By.xpath("(//button[@aria-label='Invite  to connect'])["+i+"]")).click();
			System.out.println("value of i is "+i);
			Thread.sleep(5000);
			if(i==10 || i==20 ||i==30 ||i==40 ||i==50 )
			{
				driver.navigate().refresh();
			}
		}
		
	}

}
