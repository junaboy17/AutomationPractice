package main;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

public class Util extends MainDriver {

	public Util(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	MainDriver md = MainDriver.getDriverInstance();
	
	WebDriver driver = md.getDriver();

	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	
}
