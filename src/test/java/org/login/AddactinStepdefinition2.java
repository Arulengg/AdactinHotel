package org.login;

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

public class AddactinStepdefinition2 extends BaseClass {

    static WebDriver driver;

    @Given("Open the Adactin url")
    public void open_the_Adactin_url() {

	Lauchurl("http://adactinhotelapp.com/index.php");

    }

    @When("user enter the username and password")
    public void user_enter_the_username_and_password() {
	LoginPOJO loginpage = new LoginPOJO();

	WebElement username = loginpage.getusername();
	WebElement password = loginpage.getPassword();
	enterText(username, "Arulpragasam");
	enterText(password, "Arulgreat@7");
    }

    @Then("user clicks the Login button")
    public void user_clicks_the_Login_button() {

    }

    @And("Login Succefull")
    public void login_Succefull() {

    }

    @And("user select the {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void user_select_the_and_and_and_and_and_and_and(String locations, String hotels, String roomType,
	    String nrooms, String date, String checkOut, String adultrooms1, String childrooms2) {

    }

    @Then("Search Hotel")
    public void search_Hotel() {

    }

    @And("Click search button")
    public void click_search_button() {

    }

    @And("User Select the Hotel")
    public void user_Select_the_Hotel() {

    }

    @And("click the continue button")
    public void click_the_continue_button() {

    }

    @And("user select {string} and {string} and {string} and  {string}and {string} and {string} and  {string} and  {string}")
    public void user_select_and_and_and_and_and_and_and(String fname, String lastName, String address, String credicard,
	    String ccType, String expiryDate, String year, String cvvNUmber) {

    }

    @And("Click Book now button")
    public void click_Book_now_button() {

    }

    @And("user enter the book now button")
    public void user_enter_the_book_now_button() {

    }

    @And("verify the order ID")
    public void verify_the_order_ID() {

    }

}
