package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
    @FindBy(xpath="//div[.='Add to Cart']")
    private WebElement addtocartbtn;
    
    public Product(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void addtocart() {
    	addtocartbtn.click();
    }
}
