package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify_the_website_heading2 {

	static String Heading = "//*[contains(text(),'Learn from Industry Experts')]";
	@Test
	public void VerifyHeading() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManikantaGaddavalasa\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        
        //open Website        
        driver.get("https://alchemy.hguy.co/lms/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //String title = driver.getTitle();
        String header = driver.findElement(By.xpath(Heading)).getText();
        System.out.println(header);
       
        Assert.assertEquals("Learn from Industry Experts" ,header);
        Reporter.log("Header Matches");
        
        driver.close();

	}

}
