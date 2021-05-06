package com.qa.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Paths.EbaytPom;
import com.qa.Paths.FlipkartPom;

public class Autodemo {
	
	static WebDriver driver = null;
	@BeforeTest
	public static void setBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Soft tools auto\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public static void getdone() throws InterruptedException {
		EbaytPom flipkartPom = new EbaytPom(driver);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
		flipkartPom.setSearch().sendKeys("iphone");
		flipkartPom.goSearch();
		flipkartPom.click1st();
		flipkartPom.clickAddtoCart();
		Thread.sleep(2000);
	}
	@AfterTest
	public static void Teardown() {
		driver.close();
		driver.quit();
		System.out.println("Test executed succesfullhy");
	}	
}
