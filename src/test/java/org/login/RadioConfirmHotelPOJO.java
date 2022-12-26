package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioConfirmHotelPOJO extends BaseClass{
    
    public RadioConfirmHotelPOJO() {
	
	PageFactory.initElements(driver, this);
    }
    @FindBy(id ="radio_btn")
    private WebElement radioButton;
    @FindBy(id ="continue_Btn")
    private WebElement continueButton;
    public WebElement getRadioButton() {
        return radioButton;
    }
    public void setRadioButton(WebElement radioButton) {
        this.radioButton = radioButton;
    }
    public WebElement getContinueButton() {
        return continueButton;
    }
    public void setContinueButton(WebElement continueButton) {
        this.continueButton = continueButton;
    }
}
