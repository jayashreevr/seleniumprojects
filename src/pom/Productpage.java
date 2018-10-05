package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	@FindBy(partialLinkText="Areum ")
	private WebElement prod1;
	
	@FindBy(xpath="//a[contains(@onclick,'like_product(event,')]")
	private WebElement likebtn;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productclick() {
		prod1.click();
	}
    
	public void like()
	{
		likebtn.click();
	}
	
}
