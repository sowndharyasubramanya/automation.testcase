package mobile_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin {
@Test

	public void register() throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/sowndharya.s/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://mobileworld.azurewebsites.net/");
	     driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.id("username")).sendKeys("sowndharya");
	     driver.findElement(By.id("password")).sendKeys("sowndharya1234");
	     driver.findElement(By.cssSelector("a[class*='btn btn-primary btn-block']")).click();
	        




	}

}
