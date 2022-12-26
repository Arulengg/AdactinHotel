package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSearchHotelPoJO extends BaseClass {
    
    public ConfirmSearchHotelPoJO(){
	
	PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="Search_hotel")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

}
