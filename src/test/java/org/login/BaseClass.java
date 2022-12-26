package org.login;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    WebDriver driver;

    public void Lauchurl(String url) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);

    }

    public void enterText(WebElement element, String text) {
	element.sendKeys(text);

    }

    public void buttonClick() {
	WebElement findElement = driver.findElement(By.id("login"));
	findElement.click();

    }

    public void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);

    }

    public void quiteBrowser() throws InterruptedException {
	Thread.sleep(50000);
	driver.close();

    }

    public void seelctByVisibleText(WebElement element, String text) {
	Select select = new Select(element);
	select.selectByVisibleText(text);

    }

}
