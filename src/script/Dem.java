package script;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Auto_constant;
import generics.Excel;
import pom.Productpage;
import pom.Welcomepage;
import pom.Womensection;

public class Dem implements Auto_constant {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kraftly.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Welcomepage wp = new Welcomepage(driver);
		Womensection ws=new  Womensection(driver);
		ws.womensection(driver);
		
	}
}
