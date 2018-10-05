package script;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Auto_constant;
import generics.Excel;
import pom.LoginPage;
import pom.Product;
import pom.Productpage;
import pom.Welcomepage;

public class Script2 implements Auto_constant{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kraftly.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Alert ele = driver.switchTo().alert();
		//wait.until(ExpectedConditions.visibilityOf(ele));
		//ele.dismiss();
		Welcomepage wp = new Welcomepage(driver);
		Thread.sleep(3000);
		wp.signupbtn();
		Thread.sleep(3000);
		wp.signinbtn();
		LoginPage lp = new LoginPage(driver);
		lp.emailtb(Excel.abc(excelpath, "Sheet1", 0, 1));
		lp.passwordtb(Excel.abc(excelpath, "Sheet1", 1, 1));
		lp.signinenter();
		Thread.sleep(3000);
		wp.searchtb(Excel.abc(excelpath, "Sheet1", 2, 1));
		wp.searchiconbtn();
		
		Thread.sleep(3000);
		Productpage pp = new Productpage(driver);
		Thread.sleep(3000);
		pp.productclick();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		
		Thread.sleep(3000);
		Product p = new Product(driver);
		p.addtocart();
		wp.cartlist();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		if(url=="https://kraftly.com/cart?ref=top_nav_bar_desktop")
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		Thread.sleep(3000);
		wp.accountbutton();
		wp.logoutbtn();
	}


}
