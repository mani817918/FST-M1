package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verifylogin6 {
	
	static String MyAccount = "//a[contains(text(),'My Account')]";
	static String MyAccheader = "//h1[contains(text(),'My Account')]";
	static String Login = "//a[contains(text(),'Login')]";
	static String Username = "//input[@id='user_login']";
	static String Password = "//input[@id='user_pass']";
	static String Submit = "//*[@id='wp-submit']";
	static String Logout = "//*[contains(text(),'Logout')]";
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
        driver.close();
	}

}
