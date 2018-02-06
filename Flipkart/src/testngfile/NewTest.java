package testngfile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(priority=0)
  public void signup() {
	  driver.findElement(By.linkText("Sign up")).click();
	  driver.findElement(By.id("mobile")).sendKeys("9014822407");
	  driver.findElement(By.id("name")).sendKeys("vamshi");
	  driver.findElement(By.id("email")).sendKeys("vamshidhar1394@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("V@mshi410");
	  driver.findElement(By.linkText("CONTINUE")).click();
	   }
  @Test(priority=1)
  public void login(){
	  driver.findElement(By.xpath("//div[@class='_3wL5U']/a")).click();
	  driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9581068222");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("V@mshi410");
	  driver.findElement(By.linkText("LOGIN")).click();
  }
  @Test(priority=2)
  public void homepage(){
	 //Actions a= new Actions(driver);
	  driver.findElement(By.id("location")).sendKeys("hemanagar");
	//a.moveToElement(driver.findElement(By.xpath("//div[@class='_2PgQx']/div/div[@class='_3PvJF']/div[1]/span"))).build().perform();
	//Select drop=new Select(driver.findElement(By.xpath("//div[@class='_2PgQx']/div/div[@class='_3PvJF']/div[1]/span"))); 
	// drop.selectByValue("hemana");
	  
	  
  }
	  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.swiggy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
