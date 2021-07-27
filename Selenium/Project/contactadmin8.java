package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class contactadmin8 {
	
	static String MyAccount = "//a[contains(text(),'My Account')]";
	static String MyAccheader = "//h1[contains(text(),'My Account')]";
	static String Login = "//a[contains(text(),'Login')]";
	static String Username = "//input[@id='user_login']";
	static String Password = "//input[@id='user_pass']";
	static String Submit = "//*[@id='wp-submit']";
	static String Logout = "//*[contains(text(),'Logout')]";
	static String AllCourses = "//*[contains(text(),'All Courses')]";
    static String Contact = "//*[contains(text(),'Contact')]";
    static String FullName = "//*[@id=\"wpforms-8-field_0\"]";
    static String Email = "//*[@id=\"wpforms-8-field_1\"]";
    static String Sub = "//*[@id=\"wpforms-8-field_3\"]";
    static String Msg = "//*[@id=\"wpforms-8-field_2\"]";  
    static String submit1 = "//*[contains(text(),'Send Message')]";
    static String Conmsg = "//*[@id=\"wpforms-confirmation-8\"]/p";
    
    
@Test
	public void Verifylogin() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManikantaGaddavalasa\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        
        //open Website        
        driver.get("https://alchemy.hguy.co/lms/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //String title = driver.getTitle();
        
        driver.findElement(By.xpath(MyAccount)).click();
        
        driver.findElement(By.xpath(Login)).click();
        driver.findElement(By.xpath(Username)).sendKeys("root");
        driver.findElement(By.xpath(Password)).sendKeys("pa$$w0rd");
        
        driver.findElement(By.xpath(Submit)).click();
        
        String MyAcc = driver.findElement(By.xpath(Logout)).getText();
        System.out.println(MyAcc);
        Reporter.log("Verified login");
        
        driver.findElement(By.xpath(Contact)).click();
        
        boolean Ful = driver.findElement(By.xpath(FullName)).isDisplayed();
        boolean Email1 = driver.findElement(By.xpath(Email)).isDisplayed();
        boolean sub1 = driver.findElement(By.xpath(Sub)).isDisplayed();
        boolean msg1 = driver.findElement(By.xpath(Msg)).isDisplayed();
        
        if(Ful && Email1 && sub1 && msg1) {
        	driver.findElement(By.xpath(FullName)).sendKeys("Test");
        	driver.findElement(By.xpath(Email)).sendKeys("Test@test.com");
        	driver.findElement(By.xpath(Sub)).sendKeys("test");
        	driver.findElement(By.xpath(Msg)).sendKeys("Testing Cmt");
        	
        	driver.findElement(By.xpath(submit1)).click();
        	
        	String PtConmsg = driver.findElement(By.xpath(Conmsg)).getText();
        	System.out.println(PtConmsg);
        	
        }
        
        driver.close();
	}

}
