
package org.step;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.login.BaseClass;
import org.login.LoginPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStepDefinition {

    static WebDriver driver;

    @Given("Open the Adactin url")
    public void open_the_Adactin_url() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://adactinhotelapp.com/index.php");
	Thread.sleep(500);

    }

    @When("user enter the {string} and {string}")
    public void user_enter_the_and(String string, String string2) throws InterruptedException {

	WebElement textusername = driver.findElement(By.id("username"));
	textusername.sendKeys(string);
	WebElement textpassword = driver.findElement(By.id("password"));
	textpassword.sendKeys(string2);
	Thread.sleep(3000);

    }

    @Then("user clicks the Login button")
    public void user_clicks_the_Login_button() {

	WebElement findElement = driver.findElement(By.id("login"));
	findElement.click();

    }

    @And("Login Succefull")
    public void login_Succefull() {
	System.out.println("Login Success");

    }

    @And("user select the {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void user_select_the_and_and_and_and_and_and_and(String locations, String hotels, String roomType,
	    String nrooms, String date, String checkOut, String adultrooms1, String childrooms2) throws InterruptedException {

	WebElement location = driver.findElement(By.id("location"));
	Select select = new Select(location);
	select.selectByIndex(1);
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select select1 = new Select(hotel);
	select1.selectByIndex(1);

	WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
	Select select2 = new Select(room);
	select2.selectByVisibleText(roomType);

	WebElement nroomsE = driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select roomsDr = new Select(nroomsE);
	roomsDr.selectByVisibleText(nrooms);

	WebElement dateTy = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	dateTy.sendKeys(date);

	WebElement checkOutE = driver.findElement(By.id("datepick_out"));
	checkOutE.sendKeys(checkOut);

	WebElement adultroomEL = driver.findElement(By.xpath("//select[@id='adult_room']"));
	Select adultsrooms = new Select(adultroomEL);
	adultsrooms.selectByVisibleText(adultrooms1);

	WebElement childRooms = driver.findElement(By.xpath("//select[@id='child_room']"));
	Select chldRoom = new Select(childRooms);
	chldRoom.selectByVisibleText(childrooms2);
	Thread.sleep(5000);

    }

    @Then("Search Hotel")
    public void search_Hotel() throws InterruptedException {

	Thread.sleep(1000);
	driver.close();

    }

    @And("Click search button")
    public void click_search_button() {

	WebElement searchbtn = driver.findElement(By.id("Submit"));
	searchbtn.click();

    }

    @And("User Select the Hotel")
    public void user_Select_the_Hotel() {

	WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	radiobtn.click();

    }

    @And("click the continue button")
    public void click_the_continue_button() {
	WebElement continue1 = driver.findElement(By.id("continue"));
	continue1.click();

    }

    @And("user select {string} and {string} and {string} and  {string}and {string} and {string} and  {string} and  {string}")
    public void user_select_and_and_and_and_and_and_and(String fname, String lastName, String address, String credicard,
	    String ccType, String expiryDate, String year, String cvvNUmber) throws InterruptedException {

	WebElement firstName = driver.findElement(By.name("first_name"));
	firstName.sendKeys(fname);
	WebElement lastName1 = driver.findElement(By.name("last_name"));
	lastName1.sendKeys(lastName);
	WebElement adrs = driver.findElement(By.name("address"));
	adrs.sendKeys(address);
	WebElement cc = driver.findElement(By.name("cc_num"));
	cc.sendKeys(credicard);
	WebElement cctype = driver.findElement(By.name("cc_type"));
	Select ccTypeDrop = new Select(cctype);
	ccTypeDrop.selectByVisibleText(ccType);
	WebElement expirayMonth = driver.findElement(By.name("cc_exp_month"));
	Select expiry = new Select(expirayMonth);
	expiry.selectByVisibleText(expiryDate);
	WebElement expirayYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select expiryYr = new Select(expirayYear);
	expiryYr.selectByVisibleText(year);
	WebElement ccnumber = driver.findElement(By.id("cc_cvv"));
	ccnumber.sendKeys(cvvNUmber);
	Thread.sleep(5000);

    }

    @And("Click Book now button")
    public void click_Book_now_button() throws InterruptedException {

	WebElement bookNow = driver.findElement(By.id("book_now"));
	bookNow.click();
	Thread.sleep(5000);

    }

    @And("user enter the book now button")
    public void user_enter_the_book_now_button() {

    }

    @And("verify the order ID")
    public void verify_the_order_ID() {

    }

}
