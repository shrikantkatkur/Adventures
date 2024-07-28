package com.adventures.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.adventures.base.Base;

public class CreateNewAccountPage extends Base {
	
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
		userIconBtn.click();
	}
	
	public void clickCreateNewAccountLink() {
		createNewAccountLink.click();
	}

	public void enterUserName(String user) {
		userName.sendKeys(user);
	}

	public void enterEmail(String id) {
		email.sendKeys(id);
	}

	public void enterPass(String pwd) {
		pass.sendKeys(pwd);
	}

	public void enterConfirmPass(String conpwd) {
		confirmPass.sendKeys(conpwd);
	}

	public void enterFName(String fname) {
		fName.sendKeys(fname);
	}

	public void enterLName(String lname) {
		lName.sendKeys(lname);
	}

	public void enterPhone(String ph) {
		phone.sendKeys(ph);
	}

	public void enterCountry(String coun) {
		country.click();
		WebElement count = country;
		Select sel = new Select(count);
		sel.selectByVisibleText(coun);

	}

	public void enterCity(String cty) {
		city.sendKeys(cty);
	}

	public void enterAddress(String add) {
		address.sendKeys(add);
	}

	public void enterState(String ste) {
		state.sendKeys(ste);
	}

	public void enterPincode(String code) {
		pincode.sendKeys(code);
	}

	public void clickCheckbox() {
		checkbox.click();
	}

	public void clickReg_Btn() {
		regBtn.click();
	}

}
