package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
    @FindBy(xpath="//button[contains(.,'Account ')]")
    private WebElement accountbtn;
    
    @FindBy(xpath="//button[.='Sign Up']")
    private WebElement signup;
    
    @FindBy(linkText="Log Out")
    private WebElement lout;
    
    @FindBy(linkText="Sign In")
    private WebElement signin;
    
    @FindBy(id="search-desktop")
    private WebElement search;

    @FindBy(xpath="//button[.='Search']")
    private WebElement searchicon;
    
    @FindBy(xpath="//a[@class='cart_top']")
    private WebElement cartlistbtn;
    
    @FindBy(xpath="//a[@class='yourLikes']")
    private WebElement liked;
      
    public Welcomepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void accountbutton() {
    	accountbtn.click();
    }
    
    public void signupbtn() {
    	signup.click();
    }
    
    public void logoutbtn() {
    	lout.click();
    }
    
    public void signinbtn() {
    	signin.click();
    }
    
    public void searchtb(String s) {
    	search.sendKeys(s);
    }
    
    public void searchiconbtn() {
    	searchicon.click();
    }
    
    public void cartlist()
    {
    	cartlistbtn.click();
    }
    
    public void likedsection() {
    	liked.click();
    }
    
}
