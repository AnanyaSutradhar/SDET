package SDET_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TraversingTables8 
{

	@Test
	
	public void TraversingTables()
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
        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
        
        //text and  properties (different syntax) 
        //WebElement combobox=driver.findElement(By.xpath("//a[@class='dropdown-toggle grouptab']"));
        //WebElement combobox=driver.findElement(By.xpath("//a[@href='#']"));
       
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']")));
        
        
        //WebElement accounts_table=driver.findElement(By.xpath("//table[@class='list view table-responsive']"));
        List<WebElement> tablerow=driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr[@class='oddListRowS1']"));
        for(int i=0; i<5; i++)
        {
        	//List<WebElement> tablecell=tablerow.get(i).findElements(By.xpath(".//td"));
        	//System.out.println(tablecell.get(2).getText());
        	
        	WebElement tablecell1=tablerow.get(i).findElement(By.xpath(".//td[@type='name']"));
        	System.out.println(tablecell1.getText());
        }
        
        driver.quit();
        
	}
}
