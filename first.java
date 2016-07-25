package Beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver p = new ChromeDriver();
		p.get("http://www.seleniumhq.org/");
		p.findElement(By.id("q")).sendKeys("vmware");
		p.findElement(By.id("submit")).click();
		p.findElement(By.className("gsc-search-button")).click();
				/*System.out.println(p.getTitle());
		System.out.println(p.getPageSource());
		System.out.println(p.getCurrentUrl());
		p.close();*/
	}
}
