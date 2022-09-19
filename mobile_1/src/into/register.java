package into;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class register {



   WebDriver driver;
    
    public register(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    //get url
        /*public void goTo()
        {
            driver.get("https://mobileworld.banyanpro.com/");
        }*/
    
    //signin
    @FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
    WebElement signin;
    
    
    //signup
    @FindBy(linkText="Sign up")
    WebElement signup;
    
    
    
    //register form
    @FindBy(id="myName")
    WebElement firstname;
    
    @FindBy(css="input[placeholder='Last Name']")
    WebElement lastname;
    
    @FindBy(xpath="//input[@placeholder='Enter Email']")
    WebElement email;
    
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement password;
    
    @FindBy(css="input[type='date']")
    WebElement dob;
    
    @FindBy(xpath="//form/div[3]/div[4]")
    WebElement gender;
    
    @FindBy(css="input[type='number']")
    WebElement mobilenumber;
    
    @FindBy(css="textarea.form-control")
    WebElement shortbio;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement register;
    
    @FindBy(xpath="//form/div[6]/div[3]")
    WebElement signin1;
    
    
    //login form
    @FindBy(css="input[type='text']")
    WebElement user;
            
    @FindBy(css="input[type='password']")
    WebElement lpassword;
            
    @FindBy(xpath="//a[@type='submit']")
    WebElement login;
    
    
  //order
    @FindBy(xpath="/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement support;
    
    @FindBy(css="a[href='order.html']")
    WebElement order;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement firstName1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")
    WebElement lastName1;
    
    @FindBy(xpath="//input[@id='inputEmail']")
    WebElement Email1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/input[1]")
    WebElement password1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]")
    WebElement gen1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[4]/input[1]")
    WebElement Mobnum1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")
    WebElement Address1;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/input[1]")
    WebElement Address2;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/input[1]")
    WebElement cityfield;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[2]/select[1]")
    WebElement choose;
    



   @FindBy(xpath="//*[@id=\"inputState\"]/option[3]")
    WebElement statefield;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[3]/input[1]")
    WebElement zipcode;
    
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")
    WebElement choosebrand;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement brandname;
    



   @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[2]")
    WebElement choosemodel;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/input[1]")
    WebElement count;
    
    @FindBy(xpath="//*[@id=\"bought\"]/option[2]")
    WebElement Buystatus;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/input[1]")
    WebElement correct;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[10]/button[1]")
    WebElement orderbtn;
    
   
    
  //get url
    public void goTo()
            {
                driver.get("https://mobileworld.banyanpro.com/");
            }
    
    



   public void registration(String fname,String lname,String Email,
    String paswrd,String dateofbirth,String phoneno,String bio)
        {
            signin.click();
            signup.click();
            firstname.sendKeys(fname);
            lastname.sendKeys(lname);
            email.sendKeys(Email);
            password.sendKeys(paswrd);
            dob.sendKeys(dateofbirth);
            gender.click();
            mobilenumber.sendKeys(phoneno);
            shortbio.sendKeys(bio);
            register.click();
            driver.switchTo().alert().accept();
            signin1.click();
            
        }
        
                
        public void loginpage(String uname,String pword)
        {
            signin.click();
            user.sendKeys(uname);
            lpassword.sendKeys(pword);
            login.click();
            
        }
        
public void order(String fname,String lname,String email,String pwd,String num,String add1,String add2,String city,String zip) throws InterruptedException {
            
            support.click();
            order.click();
            Set windows = driver.getWindowHandles();
            java.util.Iterator it = windows.iterator();
            String parentId = (String) it.next();
            String childId = (String) it.next();
            driver.switchTo().window(childId);
            
            firstName1.sendKeys(fname);
            lastName1.sendKeys(lname);
            Email1.sendKeys(email);
            password1.sendKeys(pwd);
            gen1.click();
            Mobnum1.sendKeys(num);
            Address1.sendKeys(add1);
            Address2.sendKeys(add2);
            choose.click();
            statefield.click();
            zipcode.sendKeys(zip);
            choosebrand.click();
            brandname.click();
            choosemodel.click();
            count.sendKeys(num);
            Buystatus.click();
            correct.click();
            orderbtn.click();
            Thread.sleep(1000);
            driver.close();
    
    
    
}



	
}   

