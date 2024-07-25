package com.adventures.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adventures.base.Base;

public class LandingPage {
	Base b = new Base();

	
	@FindBy(xpath = "//div[@class=\"logo\"]")
	WebElement logo;
	
	@FindBy(xpath = "//div[@id=\"search\"]")
	WebElement searchBtn;
	
	@FindBy(xpath = "//a[@id=\"hrefUserIcon\"]")
	WebElement userBtn;
	
	@FindBy(xpath = "//input[@id=\"autoComplete\"]")
	WebElement inputBox;
	
	
	
	public String getTextOfLogo() {
		return logo.getText();
	}
	
	public  void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void enterInInputBox() {
		inputBox.sendKeys("tablet");
	}
}
