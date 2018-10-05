package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 @FindBy(linkText="Sign In")
	    private WebElement signin;
	    
	    @FindBy(id="email")
	    private WebElement emailid;
	    
	    @FindBy(id="pass")
	    private WebElement pass;
	    
	    @FindBy(id="ga_signin")
	    private WebElement sin;
	    
	    public LoginPage(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void signinbtn() {
	    	signin.click();
	    }
	    
	    public void emailtb(String a) {
	    	emailid.sendKeys(a);
	    }
	    
	    public void passwordtb(String a) {
	    	pass.sendKeys(a);
	    }
	    
	    public void signinenter() {
	    	sin.click();
	    }
}
