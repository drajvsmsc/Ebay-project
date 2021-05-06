package com.qa.Paths;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class EbaytPom {
	static WebDriver driver;
	
	public EbaytPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"gh-ac\"]")
	static WebElement searchBarElement;
	
	public static WebElement setSearch() {
		return searchBarElement;
	}
	@FindBy(xpath = "//input[@id='gh-btn']")
	static WebElement getSearchElement;
	
	public static void goSearch() {
		getSearchElement.click();
	}
	
	@FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")
	static WebElement get1stElement;
	
	public static void click1st() {
		get1stElement.click();
	}
	@FindBy(xpath = "//*[@id=\"isCartBtn_btn\"]")
	static WebElement addToCartElement;
	
	public static void clickAddtoCart() {
		addToCartElement.click();
	}

}
