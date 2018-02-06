package flipkart;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module1 {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		driver.findElement(By.linkText("Signup")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9014822407");
		//driver.findElement(By.xpath("button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']/div/form/div[2]/button/span")).click();
		driver.findElement(By.xpath("//*[text()='Existing User? Log in']")).click();
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']/div/form/div[1]/input")).sendKeys("9014822407");
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']/div//div[2]/input")).sendKeys("vamshi410");
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//div[3]/button")).click();
//		driver.findElement(By.xpath("//div[@class='_3Ed3Ub']/ul/li[3]/a/span")).click();
//		driver.findElement(By.xpath("//*[text()='Shirts']")).click();
	
//		WebElement ele  = driver.findElement(By.xpath("html/body/div[1]/div/header/div[1]/div[2]/div/div/a"));
//		Actions act=new Actions(driver);
//		act.moveToElement(ele).build().perform();
//		driver.findElement(By.xpath("html/body/div[1]/div/header/div[1]/div[2]/div/div/a")).click();

//		driver.findElement(By.name("LoginText1")).clear();
//		System.out.println("Username: ");
//		Scanner scan1 = new Scanner(System.in);
//		String input1 = scan1.nextLine();
//		System.out.println(input1);
//		
//		
		
		
		
		
		
		
		
		
		
	}

}
