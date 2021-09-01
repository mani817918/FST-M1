package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyMyAccount5 {

	static String MyAccount = "//a[contains(text(),'My Account')]";
	static String MyAccheader = "//h1[contains(text(),'My Account')]";
	@Test
	public void VerifyMyAccount() {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManikantaGaddavalasa\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		        WebDriver driver = new ChromeDriver();
		        
		        //open Website        
		        driver.get("https://alchemy.hguy.co/lms/");
		        driver.manage().window().maximize();
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        //String title = driver.getTitle();
		        
		        driver.findElement(By.xpath(MyAccount)).click();
		        
		        String MyAccheadername = driver.findElement(By.xpath(MyAccheader)).getText();
		        System.out.println(MyAccheader);
		       
		        Assert.assertEquals("My Account" ,MyAccheadername);
		        Reporter.log("My Account header Matches");
		        driver.close();
	}

}
