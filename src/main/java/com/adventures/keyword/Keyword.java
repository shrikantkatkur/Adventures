package com.adventures.keyword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.adventures.base.Base;

import dev.failsafe.internal.util.Durations;

public class Keyword extends Base {

	public void clickOnElement(WebElement e) {
		e.click();
	}

	public void enterText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public String getText(WebElement e) {
		return e.getText();
	}

	
}
