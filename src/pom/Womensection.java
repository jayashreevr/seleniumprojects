package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womensection {
	 @FindBy(linkText="Women")
	 private WebElement womensectionpart;
	 
	 @FindBy(xpath="(//a[@href='/c/women/ethnic-wear'])[1]")
	 private WebElement ethnic;

	 @FindBy(linkText="Lehengas")
	 private WebElement lehengas;

	 @FindBy(xpath="(//a[contains(@title,'Partywear')])[1]")
	 private WebElement pw;
	 
	 public Womensection(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	   
	public void womensection(WebDriver driver) {
    	Actions a = new Actions(driver);
    	a.moveToElement(womensectionpart).perform();
    }
	
	public void ethnicwear(WebDriver driver) {
    	Actions a = new Actions(driver);
    	a.moveToElement(ethnic).perform();
    }
	
	public void lehengaslink() {
		lehengas.click();
	}
	
	public void product1() {
		pw.click();
	}
}
