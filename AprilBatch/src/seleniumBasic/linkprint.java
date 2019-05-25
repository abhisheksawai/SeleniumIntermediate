package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
			//to findelements
			//WebElement links=(WebElement) driver.findElements(By.tagName("a"));
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
			//Counting no of links in result page
			//System.out.println(links.size());
			
//			for(int i=0;i<=links.size();i++)
//			{
//				System.out.println(links.size(i).get.link(i));
//				
//			}
			
//			for(int j = 0 ; j <=52 ; j ++)
//			{
//				System.out.println(links.get(j).getText());
//			}
			


//			for(Object allmylinks :links)
//			{
//				System.out.println(allmylinks);
//			}
			System.out.println("-----------");
			
			for(WebElement allmylinks : links)
			{
				System.out.println(allmylinks.getText());
			}

	}

}
