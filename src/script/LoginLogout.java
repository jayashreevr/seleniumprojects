package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_constant;
import generics.Excel;
import pom.LoginPage;
import pom.Welcomepage;

public class LoginLogout implements Auto_constant{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kraftly.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Welcomepage wp = new Welcomepage(driver);
		wp.signupbtn();
		wp.signinbtn();
		LoginPage lp = new LoginPage(driver);
		lp.emailtb(Excel.abc(excelpath, "Sheet1", 0, 1));
		lp.passwordtb(Excel.abc(excelpath, "Sheet1", 1, 1));
		lp.signinenter();
		Thread.sleep(3000);
		wp.accountbutton();
		wp.logoutbtn();
	}
}
