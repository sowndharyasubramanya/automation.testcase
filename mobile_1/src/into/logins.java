package into;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logins {

	@Test
	   public  void setup() throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sowndharya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		register log=new register(driver);
		 log.goTo();
		 log.loginpage("sowndharya","sow123");

	   }
 

}

