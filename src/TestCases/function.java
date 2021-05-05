package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.pageobjects;
import reusables.browser;

public class function extends browser{
	/**
	 * This method is used for Product search
	 * @author karthickb 	
	 * @throws InterruptedException
	 */
	@Test
	public void amazon_product_search() throws InterruptedException {
		driver.get("https://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver,10);	  
		pageobjects obj = new pageobjects();
		wait.until(ExpectedConditions.visibilityOf(obj.SearchBar));
		obj.SearchBar.sendKeys("shoes");
		obj.SearchButton.click();
		wait.until(ExpectedConditions.visibilityOf(obj.SecondProduct));
		obj.SecondProduct.click();
		Thread.sleep(3000);
	}


}
