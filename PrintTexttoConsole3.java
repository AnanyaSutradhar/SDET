package SDET_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintTexttoConsole3 
{
	@Test
	
	public void PrintToConsole()
	{
		//System Property for Chrome driver
  		System.setProperty("webdriver.chrome.driver", "C:\\Ananya_sel\\chromedriver.exe");
  		
  		//System Property for Chrome driver
  		WebDriver driver = new ChromeDriver();
  		
  		//Launch Website
  		driver.navigate().to("http://alchemy.hguy.co/crm");
  		
  		//1st way:
		String myText = driver.findElement(By.xpath("//*[@id='admin_options']")).getText();
        System.out.println("First copyright text at the footer : " + myText);

        //2nd way: Directly use id 
        //myText = driver.findElement(By.id("admin_options")).getText();
        //System.out.println("First copyright text at the footer : " + myText);
        
      //Close the browser
  		driver.quit();
	}

}
