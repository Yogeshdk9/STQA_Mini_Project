package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class edurekaseletest {
	@Test
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:/YDK/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).clear();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("yogesh9028446275@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys("yogileo10");	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Enter Course, Category or keyword']")).click();
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Selenium Certification Training");
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[text()='View Details']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='webinar-profile-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(5000);

	}
}