package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioandCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Notes April\\all jars are here\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. get("https://www.facebook.com/");
		
		List<WebElement> radios = driver.findElements(By.name("sex"));	// all radio
		
		System.out.println("Total radio buttons -> "+ radios.size());	// total no of radio
		
		System.out.println(radios.get(0).isDisplayed());	//male radio button is displayed or not
		
		System.out.println(radios.get(0).isEnabled());	// male radio button is Enabled or not
		
		System.out.println(radios.get(0).isSelected());	// male radio button is Selected or not
		
		radios.get(1).click(); // male radio button will be selected

		
	}

}
