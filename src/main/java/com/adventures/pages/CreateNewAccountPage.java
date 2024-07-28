package com.adventures.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.adventures.base.Base;

public class CreateNewAccountPage extends Base {

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

	@FindBy(xpath = "//a[@id=\"menuUserLink\"]")
	WebElement userIconBtn;

	@FindBy(xpath = "//a[text()='CREATE NEW ACCOUNT']")
	WebElement createNewAccountLink;

	@FindBy(xpath = "//input[@name=\"usernameRegisterPage\"]")
	WebElement userName;

	@FindBy(xpath = "//input[@name=\"emailRegisterPage\"]")
	WebElement email;

	@FindBy(xpath = "//input[@name=\"passwordRegisterPage\"]")
	WebElement pass;

	@FindBy(xpath = "//input[@name=\"confirm_passwordRegisterPage\"]")
	WebElement confirmPass;

	@FindBy(xpath = "//input[@name=\"first_nameRegisterPage\"]")
	WebElement fName;

	@FindBy(xpath = "//input[@name=\"last_nameRegisterPage\"]")
	WebElement lName;

	@FindBy(xpath = "//input[@name=\"phone_numberRegisterPage\"]")
	WebElement phone;

	@FindBy(xpath = "//select[@name=\"countryListboxRegisterPage\"]")
	WebElement country;

	@FindBy(xpath = "//input[@name=\"cityRegisterPage\"]")
	WebElement city;

	@FindBy(xpath = "//input[@name=\"addressRegisterPage\"]")
	WebElement address;

	@FindBy(xpath = "//input[@name=\"state_/_province_/_regionRegisterPage\"]")
	WebElement state;

	@FindBy(xpath = "//input[@name=\"postal_codeRegisterPage\"]")
	WebElement pincode;

	@FindBy(xpath = "//input[@name=\"i_agree\"]")
	WebElement checkbox;

	@FindBy(xpath = "//button[@id=\"register_btn\"]")
	WebElement regBtn;

	public void clickUserIconBtn() {

		wait.until(ExpectedConditions.elementToBeClickable(userIconBtn)).click();
	}

	public void clickCreateNewAccountLink() {

		wait.until(ExpectedConditions.elementToBeClickable(createNewAccountLink));
		createNewAccountLink.click(); 
	}

	public void enterUserName(String user) {
		wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(user);
	}

	public void enterEmail(String id) {
		wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(id);
	}

	public void enterPass(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys(pwd);
	}

	public void enterConfirmPass(String conpwd) {
		wait.until(ExpectedConditions.visibilityOf(confirmPass)).sendKeys(conpwd);
	}

	public void enterFName(String fname) {
		wait.until(ExpectedConditions.visibilityOf(fName)).sendKeys(fname);
	}

	public void enterLName(String lname) {
		wait.until(ExpectedConditions.visibilityOf(lName)).sendKeys(lname);
	}

	public void enterPhone(String ph) {
		wait.until(ExpectedConditions.visibilityOf(phone)).sendKeys(ph);
	}

	public void enterCountry(String coun) {
		wait.until(ExpectedConditions.elementToBeClickable(country)).click();
		Select sel = new Select(country);
		sel.selectByVisibleText(coun);
	}

	public void enterCity(String cty) {
		wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(cty);
	}

	public void enterAddress(String add) {
		wait.until(ExpectedConditions.visibilityOf(address)).sendKeys(add);
	}

	public void enterState(String ste) {
		wait.until(ExpectedConditions.visibilityOf(state)).sendKeys(ste);
	}

	public void enterPincode(String code) {
		wait.until(ExpectedConditions.visibilityOf(pincode)).sendKeys(code);
	}

	public void clickCheckbox() {
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
	}

	public void clickReg_Btn() {
		wait.until(ExpectedConditions.elementToBeClickable(regBtn)).click();
	}
}
