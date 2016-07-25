package Beginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver f= new ChromeDriver();
		f.get("http://www.spicejet.com/");
		f.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		f.findElement(By.xpath("//a[@value='GOI']")).click();
		//f.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a")).click();
		f.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		f.findElement(By.xpath("//a[@value='AMD']")).click();		
			
		Select dropdown= new Select(f.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);
		//dropdown.selectByVisibleText("9 Adults");
		f.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
	}

}
