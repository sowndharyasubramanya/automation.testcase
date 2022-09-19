package mobile_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
	@Test
	public void register() throws InterruptedException {
// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/sowndharya.s/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		    driver.get("https://mobileworld.azurewebsites.net");
		    Thread.sleep(1000);
	        driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	        Thread.sleep(1200);
	        driver.findElement(By.linkText("Sign up")).click();
	        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sowndharya");
	        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sowndharya");
	        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("sowndharya11@gmail.com");
	        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("you@28092001");
	        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09");
	        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("28");
	        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2001");
	        driver.findElement(By.xpath("//input[@type='radio']")).click();
	        driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[3]/div[4]/input")).click();
	        ///driver.findElement(By.className("Female")).click();
	        ///driver.findElement(By.xpath("/div/)).click();
	        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("23456789");
	        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hi this is sowndharya");
	}

}
