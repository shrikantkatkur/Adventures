package com.adventures.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.adventure.exception.InvalidBrowserNameException;
import com.adventures.utilities.Config;

public class Base {
	protected RemoteWebDriver driver;
	Config config = new Config();
	private static final Logger log = Logger.getLogger(Base.class);

	public RemoteWebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public RemoteWebDriver setUp() throws InvalidBrowserNameException {

		if (config.getBrowserName().equalsIgnoreCase("Chrome")) {
			log.info("opening " + config.getBrowserName() + " Browser");
			driver = new ChromeDriver();
		} else if (config.getBrowserName().equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			log.info("opening " + config.getBrowserName() + " Browser");
		} else if (config.getBrowserName().equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
			log.info("opening " + config.getBrowserName() + " Browser");
		} else {
			// throw new InvalidBrowserNameException(config.getBrowserName());
			log.error("Invalid Browser  " + config.getBrowserName());
		}
		driver.get(config.getUrl());
		driver.manage().window().maximize();

		return driver;

	}

//	@AfterMethod
//	public void tearDown() {
//		log.info("Closing Browser");
//		driver.close();
//		driver.quit();
//	}

}
