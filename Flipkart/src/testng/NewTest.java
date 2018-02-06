package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void signup() throws Exception {
	  driver.findElement(By.id("i-icon-profile")).click();
	  driver.findElement(By.xpath("//li[contains(text(),'Sign Up')]")).click();
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@class='W260 M24A']/span/a")).click();
	  driver.findElement(By.id("email-mobile")).sendKeys("vamshireddy406@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("V@mshi410");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
