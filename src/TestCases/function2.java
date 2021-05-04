package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.pageobjects;
import reusables.browser;

public class function2 extends browser{




	@Test
	public void f() throws InterruptedException {


		driver.get("https://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver,10);	  

		pageobjects obj = new pageobjects();

		obj.SearchBar.sendKeys("shoes");
		obj.SearchButton.click();
		obj.SecondProduct.click();

	}


}
