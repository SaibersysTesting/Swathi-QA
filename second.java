package Beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver x=new ChromeDriver();
		x.get("https://login.salesforce.com");
		x.findElement(By.cssSelector("#username")).sendKeys("pranaya");
		x.findElement(By.cssSelector("#password")).sendKeys("pranaya");
		//#username
		////*[@id="username"]
		/*x.findElement(By.id("username")).sendKeys("pranaya");
		x.findElement(By.id("password")).sendKeys("pranaya");
		x.findElement(By.id("forgot_password_link")).click();*/
		//x.findElement(By.name("Login")).click();
		
	}
}
