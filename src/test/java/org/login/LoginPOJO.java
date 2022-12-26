package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass {
    
    public LoginPOJO() {
	
	PageFactory.initElements(driver, this);
	
    }
    @FindBy(xpath ="//input[@id='username']")
    private WebElement username;
    @FindBy(xpath ="//input[@id='password']")
    private WebElement password;
    @FindBy(id="login")
    private WebElement login;
    
    public WebElement getusername() {
        return username;
    }
    public void setUserName(WebElement userName) {
        this.username = userName;
    }
    public WebElement getPassword() {
        return password;
    }
    public void setPassword(WebElement password) {
        this.password = password;
    }
    public WebElement getLogin() {
        return login;
    }
    public void setLogin(WebElement login) {
        this.login = login;
    }
    
    
    
    

}
