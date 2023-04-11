package com.betikaProject.testCases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public class BaseClass {
    public String baseURL = "https://www.betika.com/en-ke/login";
    public String phoneNumber = "0743551248";
    public String password = "1234";
    public WebDriver driver;
    public static Logger logger;

    @BeforeClass
    public  void setupApplication(){
        logger = Logger.getLogger("betikaProject".getClass());
        PropertyConfigurator.configure("log4j.properties");
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(baseURL);
        logger.info("Betika Url Opened Successfully");
        driver.manage().window().maximize();
    }


    @AfterClass
    public void closeApplication(){
        driver.quit();
    }
}
