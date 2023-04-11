package com.betikaProject.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver local_driver;
    // Initialising elements on the browser
    public LoginPage(WebDriver remote_driver){
        local_driver = remote_driver;
        PageFactory.initElements(remote_driver, this);
    }

    /* Finding Login Page Web Elements */
    @FindBy(xpath="//input[@placeholder='e.g. 0712 234567']")
    @CacheLookup
    WebElement textPhoneNumber;

    @FindBy(xpath = "//input[@type='password']")
    @CacheLookup
    WebElement textPassword;

    @FindBy(className = "button")
    @CacheLookup
    WebElement loginBtn;


    /* Action Method on the Web Elements */
    public void setPhoneNumber(String pNumber){
        textPhoneNumber.sendKeys(pNumber);
    }

    public void setPassword(String userPassword){
        textPassword.sendKeys(userPassword);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
}





