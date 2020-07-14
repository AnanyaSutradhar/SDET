package SDET_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GettingColors5 
{
	
  @Test
	
	
	
	public void GettingColors()
	{
	
		
		//System Property for Chrome driver
  		System.setProperty("webdriver.chrome.driver", "C:\\Ananya_sel\\chromedriver.exe");
  		
  		//System Property for Chrome driver
  		WebDriver driver = new ChromeDriver();
  		
  		//Launch Website
  		driver.navigate().to("http://alchemy.hguy.co/crm");
  		driver.get("http://alchemy.hguy.co/crm");
  		
  		//Now find the username and password field elements and login
  		WebElement username=driver.findElement(By.xpath("//*[@id='user_name']"));
  		WebElement password=driver.findElement(By.xpath("//*[@id='username_password']"));
  		username.sendKeys("admin");
  		password.sendKeys("pa$$w0rd");
  		WebElement login=driver.findElement(By.xpath("//*[@name='Login']"));
  		login.click();
  		
  		String expectedUrl="https://alchemy.hguy.co/crm/index.php?module=Home&action=index"; 
        String actualUrl= driver.getCurrentUrl(); 
        Assert.assertEquals(expectedUrl,actualUrl); 
  		
        //Get the background color of the navigation menu and print console
        WebElement navigation_menu = driver.findElement(By.xpath("//div[@id='toolbar']"));

        String bgColor = navigation_menu.getCssValue("color");
        System.out.println("Before hover: " + bgColor);
        
        
        //Close the browser
        driver.quit();
        
  		
  		
	}

}

