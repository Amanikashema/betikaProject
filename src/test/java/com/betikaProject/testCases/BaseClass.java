package com.betikaProject.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public String baseURL = "https://www.betika.com/en-ke/login";
    public String phoneNumber = "0743551248";
    public String password = "1234";
    public WebDriver driver;

    @BeforeClass
    public  void setupApplication(){
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        driver.manage().window().maximize();
    }


    @AfterClass
    public void closeApplication(){
        driver.close();
    }
}
