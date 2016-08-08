package Beginning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven 
{
	
	WebDriver driver;

	@Test(dataProvider="Wordpressdata")
	public void login(String username,String password) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://wordpress.com/wp-login.php");
	
	driver.findElement(By.id("user_login")).sendKeys(username);
	
	driver.findElement(By.id("user_pass")).sendKeys(password);
	
	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	
	Thread.sleep(2000);
	
	//System.out.println(driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login");
	
	System.out.println("Page verified User logined successfully");
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();	
	}
	
	@DataProvider(name="Wordpressdata")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
				
		data[1][0]="admin2";
		data[1][1]="demo2";
		
		data[2][0]="admin3";
		data[2][1]="demo3";
		
		return data;
	}
}
