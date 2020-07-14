package SDET_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadingAdditionalInformation7 
{
	@Test
	
	public void ReadingAdditionalInformation()
	
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
        
        //Maximize the browser
   	    driver.manage().window().maximize();
  		
        //Navigating to Sales-Accounts Page
        WebElement combobox=driver.findElement(By.xpath("//a[text()='Sales']"));
   	    //WebElement combobox=driver.findElement(By.xpath("//a[@id='grouptab_0']"));
   	     //WebElement combobox=driver.findElement(By.id("grouptab_0"));
        combobox.click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        //text and  properties (different syntax) 
        //WebElement combobox=driver.findElement(By.xpath("//a[@class='dropdown-toggle grouptab']"));
        //WebElement combobox=driver.findElement(By.xpath("//a[@href='#']"));
       
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));
		
        String str = driver.findElement(By.xpath("//a[contains(text(),'Ms. Ananya Sutradhar')]")).getText();
    	System.out.println(str);  //print the name of my created row
    	
    	driver.findElement(By.id("adspan_71581148-7c8b-ec07-16b7-5f080aae215e")).click(); // click icon i
    	
    	
    	// get mobile no printed on the pop
    	
    	String text = driver.findElement(By.xpath("//*[@id='ui-id-5']/.//span[contains(@class,'phone')]")).getAttribute("innerHTML");
    	System.out.println(text);

    	driver.quit();
      
        
        
        
	}

}
