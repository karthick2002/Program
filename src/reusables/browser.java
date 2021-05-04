package reusables;

import org.testng.annotations.Test;

import pages.pageobjects;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class browser{

	public static WebDriver driver;


	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();


	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
	}

}
