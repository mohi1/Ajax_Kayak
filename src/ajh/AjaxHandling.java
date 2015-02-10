 package ajh;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxHandling {
	private WebDriver driver;
	private String baseUrl="http://www.kayak.com/";
	private StringBuffer verificationErrors = new StringBuffer();
	int vSleep;
	@BeforeMethod
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vSleep=1000;
	}
	@Test
	public void testUntitled() throws Exception{
		driver.get(baseUrl);
		driver.findElement(By.id("wherebox")).clear();
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys("Los");
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys("A");
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys(Keys.TAB);
		Thread.sleep(vSleep);
		driver.findElement(By.id("wherebox")).sendKeys(Keys.ENTER);
		Thread.sleep(vSleep);
		System.out.println(driver.findElement(By.id("origin")).getAttribute("value"));
	}
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
		/*String verificationErrorString = verificationErrors.toString();
		if(!"".equals(verificationErrorString)){
			fail(verificationErrorString);
		}*/
	} 
	/*private boolean isElementPresent(By by){
		try{
			driver.findElement(by);
			return true;
		}
	*/

}

