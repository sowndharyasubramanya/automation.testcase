import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	    
		    public class onlyselenium {
			
			public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/sowndharya.s/Downloads/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	    //driver.findElement(By.linkText("Sign up")).click();
	    //driver.findElement(By.xpath("//p/a")).click();        
	   /* driver.findElement(By.id("myName")).sendKeys("sowndharya");
	    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("s");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("sow123@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sow123");
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("09");
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("28");
	    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("2001");
	    driver.findElement(By.xpath("//form/div[3]/div[4]")).click();
	    driver.findElement(By.cssSelector("input[type='number']")).sendKeys("8248354474");
	    driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("My hobbies reading books");
	    //driver.manage().timeouts().implicitlyWait(5, Timeunit.SECONDS);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//form/div[6]/div[3]")).click();
	    driver.quit();*/
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sowndharya");
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sow123");
	    driver.findElement(By.xpath("//a[@type='submit']")).click(); 
	    
	    
	    
	    
	    
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
	

