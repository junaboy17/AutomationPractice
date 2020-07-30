package main;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Util {

	MainDriver md = MainDriver.getDriverInstance();

	WebDriver driver = md.getDriver();

	public void closeCurrentBrowser() {
		driver.close();
	}

	public void closeAllBrowser() {
		driver.quit();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void navigateToUrl(String url) {
		driver.navigate().to(url);;
	}

	public void goToUrl(String url) {
		driver.get(url);;
	}
	
	public String getText(String locator) {
		return driver.findElement(By.xpath(locator)).getText();
	}
	
	public String getAttribut(String locator, String value) {
		return driver.findElement(By.xpath(locator)).getAttribute(value);
	}

	public void validateText(String locator, String expected) {

		String actual = driver.findElement(By.xpath(locator)).getText();

		if(expected.equals(actual)) {
			System.out.println("Test Passed. Expected text matches actual text");
		}
		else {
			System.out.println("Test Failed. Expected text does not match actual text");
		}
	}

	public void notValidateText(String locator, String expected) {

		String actual = driver.findElement(By.xpath(locator)).getText();

		if(expected.equals(actual)) {
			System.out.println("Test Failed. Expected text matches actual text");
		}
		else {
			System.out.println("Test Passed. Expected text does not match actual text");
		}
	}
	
	public void validateAttribue(String locator, String expected, String value) {

		String actual = driver.findElement(By.xpath(locator)).getAttribute(value);

		if(expected.equals(actual)) {
			System.out.println("Test Passed. Expected text matches actual text");
		}
		else {
			System.out.println("Test Failed. Expected text does not match actual text");
		}
	}

}
