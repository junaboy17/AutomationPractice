package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {

	public MainDriver(WebDriver driver){
		MainDriver.driver = driver;
	}

	protected static WebDriver driver = null;
	private static MainDriver driverInstance = null;

	public static MainDriver getDriverInstance(){
		if(driverInstance==null)
			driverInstance = new MainDriver(driver);
		return driverInstance; 	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver openBrowser(String browser, String website) {

		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.get(website);

			}

			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.get(website);

			}

			else if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.get(website);

			}

			else {
				System.out.println("Incorrect browser");
			}
		}

		return driver;

	}
}
