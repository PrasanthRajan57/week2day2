package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {
	public static void main(String[] args)  {
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		 driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Prashu");
		 driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("57");
		 driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("prasanth");
		 driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Rajan");
		 driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("QA");
		 driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Test engineer is a key role");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test57@yopmail.com");
		 WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select s1=new Select(dropdown);
		 s1.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		 driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("New test is also a key");
	
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
		 
		 
	}

}
