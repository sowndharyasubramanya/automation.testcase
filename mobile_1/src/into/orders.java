package into;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class orders {


@Test
   public  void setup() throws InterruptedException {
        // TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\sowndharya.s\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        register ord = new  register(driver);
        
        ord.order("sowndharya","s","abc123@gmail.com","sow123","1234567890","#23","Slns Pg","Bangalore","540065");



   }



}