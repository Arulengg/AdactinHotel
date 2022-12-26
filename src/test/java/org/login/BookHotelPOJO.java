package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPOJO extends BaseClass {
    
    public BookHotelPOJO() {
	
	PageFactory.initElements(driver, this);
    }
    @FindBy(id = "first_name")
    private WebElement firstName;
    @FindBy(id = "last_name")
    private WebElement LastName;
    @FindBy(id = "billing_address")
    private WebElement BillingAddress;
    @FindBy(id = "credit_number")
    private WebElement CreditCardNo;
    @FindBy(id = "creditcard_type")
    private WebElement CreditCardType;
    @FindBy(id = "expiry_date")
    private WebElement  ExpiryDate;
    @FindBy(id = "CVV_numbere")
    private WebElement CVVNUmber;
    
    
    public WebElement getFirstName() {
        return firstName;
    }
    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }
    public WebElement getLastName() {
        return LastName;
    }
    public void setLastName(WebElement lastName) {
        LastName = lastName;
    }
    public WebElement getBillingAddress() {
        return BillingAddress;
    }
    public void setBillingAddress(WebElement billingAddress) {
        BillingAddress = billingAddress;
    }
    public WebElement getCreditCardNo() {
        return CreditCardNo;
    }
    public void setCreditCardNo(WebElement creditCardNo) {
        CreditCardNo = creditCardNo;
    }
    public WebElement getCreditCardType() {
        return CreditCardType;
    }
    public void setCreditCardType(WebElement creditCardType) {
        CreditCardType = creditCardType;
    }
    public WebElement getExpiryDate() {
        return ExpiryDate;
    }
    public void setExpiryDate(WebElement expiryDate) {
        ExpiryDate = expiryDate;
    }
    public WebElement getCVVNUmber() {
        return CVVNUmber;
    }
    public void setCVVNUmber(WebElement cVVNUmber) {
        CVVNUmber = cVVNUmber;
    }
    
    
    
    

}
