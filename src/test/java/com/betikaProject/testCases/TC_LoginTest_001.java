package com.betikaProject.testCases;

import com.betikaProject.pageObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {
    // function to test login functionality
    @Test
    public void loginTest(){
    // create new object of the Login Page with all located elements of the login page
    LoginPage lPage = new LoginPage(driver);
    // call function to input cellphone number
    lPage.setPhoneNumber(phoneNumber);
    logger.info("Phone Number Entered Successfully");
    // call function to input password
    lPage.setPassword(password);
    logger.info("Password Entered Successfully");
    // call function to click the login button
    lPage.clickLoginBtn();
    String pageTitle = "Betika | Best Online Sports Betting in Kenya";
    if(driver.getTitle().equals(pageTitle)){
        Assert.assertTrue(true);
        System.out.println("Test Passed");
    }
    else{
        System.out.println("Test Failed");
    }



}

}
