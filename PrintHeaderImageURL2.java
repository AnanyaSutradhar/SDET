package SDET_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintHeaderImageURL2
{
	@Test
	
	public void PrintHeaderImageURL()
	{
		//System Property for Chrome driver
  		System.setProperty("webdriver.chrome.driver", "C:\\Ananya_sel\\chromedriver.exe");
  		
  		//System Property for Chrome driver
  		WebDriver driver = new ChromeDriver();
  		
  		//Launch Website
  		driver.navigate().to("http://alchemy.hguy.co/crm");
  		
  		//Print the url of the header image
  		WebElement img=driver.findElement(By.tagName("a"));
  		String url = img.getAttribute("href");
  		
  		System.out.println(url);
  		
  		driver.quit();
	}

}
