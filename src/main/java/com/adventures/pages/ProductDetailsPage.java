package com.adventures.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.adventures.base.Base;

public class ProductDetailsPage extends Base {
	@FindBy(xpath = "//div[@class=\"SpeakersImg categoryCell\"]")
	WebElement speaker;

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement userName;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy(xpath = "//button[@id=\"sign_in_btn\"]")
	WebElement signIn;
	@FindBy(xpath = "//div[@class=\"cell categoryRight\"]/descendant::a[@class=\"productName ng-binding\"]")
	List <WebElement> listOfProducts;
	@FindBy(xpath = "//a[@id=\"menuUserLink\"]")
	WebElement userBtn;

	public void enterUserName(String user) {
		userName.sendKeys(user);
	}

	public void enterPass(String pass) {
		password.sendKeys(pass);
	}

	public void clickSiginIn() {
		signIn.click();
	}

	public List<WebElement> getListOfProduct() {
			return listOfProducts;
		 
	}

	public void clickUserBtn() {
		userBtn.click();
	}

	public void clickOnSpeaker() {
		speaker.click();
	}

}
