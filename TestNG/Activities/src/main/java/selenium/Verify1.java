package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify1 {

	WebDriver driver;
	@Test
	public void VerifyPage() {
		// TODO Auto-generated method stub
		//System.out.println("Heo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManikantaGaddavalasa\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        
        //open Website        
        driver.get("https://alchemy.hguy.co/lms/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String title = driver.getTitle();
        System.out.println(title);
       
        Assert.assertEquals("Alchemy LMS – An LMS Application" ,title);
        Reporter.log("Title Matches");
        
        driver.close();
        
        
	}
	
	

}
