package mobile_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ordertesting {
	public class order {
		@Test

			public void register() throws InterruptedException  {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:/Users/sowndharya.s/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://mobileworld.banyanpro.com/");
				driver.findElement(By.linkText("Support")).click();
			    driver.findElement(By.linkText("Order")).click();
			    Set windows = driver.getWindowHandles();
			    Iterator it = windows.iterator();
			    String parentId = (String) it.next();
			    String childId = (String) it.next(); 
			    driver.switchTo().window(childId);
		        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("sowndharya");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("s");
			    driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("sowndharya@gmail.com");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]")).sendKeys("sow123");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/input[1]")).sendKeys("8248354474");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("12th apartment 1st floor");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]")).sendKeys("power house 2nd street");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]")).sendKeys("bangalore");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]")).sendKeys("yes");
			    /*WebElement staticDropdown=driver.findElement(By.xpath("//*[@id=\"inputState\"]"));
			    Select dropdown=new Select(staticDropdown);
			    dropdown.selectByValue("karnataka");*/
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]")).click();
			    driver.findElement(By.xpath("//*[@id=\"inputState\"]/option[3]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[3]/input[1]")).sendKeys("56001");
			    driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/input")).click();
			    driver.findElement(By.xpath("//*[@id=\"Samsung\"]")).click();
			    driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[6]/div[2]/input")).sendKeys("1");
			    driver.findElement(By.xpath("//*[@id=\"bought\"]")).click();
			    driver.findElement(By.xpath("//*[@id=\"time\"]")).sendKeys("1");
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/label[1]")).click();
			    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[9]/div[2]/input[1]")).click();
			    driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[10]/button")).click();
			    
			    
			    
			    
			    
		}
			  	  }
	}


