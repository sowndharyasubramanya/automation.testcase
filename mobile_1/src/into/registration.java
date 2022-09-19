package into;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class registration {



	@Test
	   public  void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sowndharya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        register signin=new register(driver);
        signin.goTo();
        signin.registration("sowndharya","s", "sow123@gmail.com", "kunu123",
                "09/28/2001", "8248354474", "My hobbies are playing games");
   }
}