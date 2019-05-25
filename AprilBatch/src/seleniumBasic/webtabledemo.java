package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");		
		String tosearchcompanyName ="Bata India"; //company to be looked for //take all the company names in a List
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		//take all the current prices in a list 
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		for(int i=0;i<companyNames.size();i++)
		{
			if(companyNames.get(i).getText().equals(tosearchcompanyName))
				{
					System.out.println(companyNames.get(i).getText() +" ---"+currentPrices.get(i).getText()); break;
				}
		}
	}
}
