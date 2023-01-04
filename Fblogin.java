package day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fblogin {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prasanth");
	     driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("Test123@yopmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test123@yopmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		WebElement dropdown = driver.findElement(By.id("day"));
		Select s1=new Select(dropdown);
		s1.selectByValue("5");
		WebElement dp = driver.findElement(By.id("month"));
		Select s2=new Select(dp);
		s2.selectByVisibleText("Mar");
		WebElement dp1 = driver.findElement(By.id("year"));
		Select s3=new Select(dp1);
		s3.selectByValue("1998");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		

		
		
	}

}
