package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	WebDriver driver;
	public void browser(){
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		}
public void sign(){
	
	driver.findElement(By.xpath("//*[text()='New to Flipkart? Sign up']")).click();
//	driver.findElement(By.linkText("Login & Signup")).click();
	driver.findElement(By.xpath("//*[text()='Existing User? Log in']")).click();
	}
public void login() throws InterruptedException{
	driver.findElement(By.xpath("//div[@class='_39M2dM']/input[@class='_2zrpKA']")).sendKeys("9014822407");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vamshi410");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='_1avdGP']//button")).click();
}
public void homepage() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(@title,'Men')]")).click();
	driver.findElement(By.xpath("//*[contains(@title,'Shorts')]/span")).click();
	Thread.sleep(3000);
if(driver.findElement(By.xpath("//*[contains(@title,'Indian Terrain')]//div[@class='_1p7h2j']")).isSelected())
{
	driver.findElement(By.xpath("//*[contains(@title,'Indian Terrain')]//div[@class='_1p7h2j']")).click();	
}
}

	public static void main(String[] args) throws InterruptedException {
		Flip v=new Flip();
		v.browser();
		v.sign();
		v.login();
		v.homepage();
		
	}

}


