package ajh;


	

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Kayak {
	  
		
		private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://www.kayak.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitled2() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("wherebox")).clear();
	    driver.findElement(By.id("wherebox")).sendKeys("los a");
	    driver.findElement(By.linkText("1 room, 2 guests")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    driver.findElement(By.id("searchform")).click();
	    driver.findElement(By.id("fdimgbutton")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | PRICELINEPRECHEUSHFDCMP2 | 30000]]
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _self | 30000]]
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | BOOKINGDOTCOMUSB3USHFDCMP2 | 30000]]
	    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _self | 30000]]
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}



