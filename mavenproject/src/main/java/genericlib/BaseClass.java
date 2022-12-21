package genericlib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import datausability.DataDriven;
import datausability.KeyWordDriven;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  
	public KeyWordDriven k = new KeyWordDriven();
	public  DataDriven d = new DataDriven();
	 public static WebDriver driver;
	 
	 @BeforeClass
	 public void Openapp() throws Throwable
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(k.propertyFetch("url"));
	 }
	 @BeforeMethod
	 public void Login() throws Throwable
	 {
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys(k.propertyFetch("un"),Keys.TAB,k.propertyFetch("pw"),Keys.ENTER);
	 }
	 
	 @AfterMethod
	 public void Logout()
	 {
			driver.findElement(By.id("logoutLink")).click();

	 }
	 @AfterClass
	 public void Closeapp()
	 {
		   driver.close();

	 }
	 
	 
	 
	 
}
