package seleniumTDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTDDClass {
public static void main (String []args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver", );
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	driver.close();
}
}
