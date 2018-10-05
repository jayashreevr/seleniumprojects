package script;
//unlike the product
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Auto_constant;
import generics.Excel;
import pom.Likedpage;
import pom.LoginPage;
import pom.Productpage;
import pom.Welcomepage;
import pom.Womensection;

public class Script5 implements Auto_constant{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kraftly.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		Womensection ws=new Womensection(driver);
		Thread.sleep(3000);
		
		
		ws.womensection(driver);
		ws.ethnicwear(driver);
		ws.lehengaslink();
		ws.product1();
		
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		
		Productpage pp = new Productpage(driver);
		pp.like();
		wp.likedsection();
		
		Likedpage likp = new Likedpage(driver);
		Thread.sleep(3000);
		String s = likp.prodCheck();
		System.out.println(s);
		likp.likedprod1();

		ArrayList<String> a1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a1.get(2));
		likp.likedprod1();
		
		Thread.sleep(3000);
		wp.accountbutton();
		wp.logoutbtn();		
	}
	}
