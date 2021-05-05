package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusables.browser;

public class pageobjects2 extends browser {
	

public pageobjects2() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement SearchBar;
	
	

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement SearchButton;
	

	@FindBy(xpath = "(//*[contains(@class,'s-image')])[2]")
	public WebElement SecondProduct;
	
	
	
	
}
