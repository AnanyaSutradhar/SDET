package SDET_Project;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyWebsiteTitle1 
{
	@Test
  	public void VerifyTitle ()
  	{
  		String actualTitle;
  		String expectedTitle;
  		
  		//System Property for Chrome driver
  		System.setProperty("webdriver.chrome.driver", "C:\\Ananya_sel\\chromedriver.exe");
  		
  		//System Property for Chrome driver
  		WebDriver driver = new ChromeDriver();
  		
  		//Launch Website
  		driver.navigate().to("http://alchemy.hguy.co/crm");
  		
  		//Get the title of the website
  		driver.get("http://alchemy.hguy.co/crm");
  		actualTitle = driver.getTitle();
  		
  		//Assert if the actual title matches the expected title
  		expectedTitle = "SuiteCRM";
  		assertEquals(expectedTitle, actualTitle);
  		
  		//Print the actual title of the page
  		System.out.println("Actual title is " + actualTitle);
  		
  		//Close the browser
  		driver.quit();
  	}	
}
