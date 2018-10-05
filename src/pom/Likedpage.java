package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Likedpage {
   @FindBy(xpath="//p[.='Yellow Partywear Gown']")
   private WebElement verify;
   
   public Likedpage(WebDriver driver) {
	   PageFactory.initElements(driver, this);
   }
   
   public String prodCheck() {
	   return verify.getText();
   }
   
   public void likedprod1() {
	   verify.click();
   }
}
