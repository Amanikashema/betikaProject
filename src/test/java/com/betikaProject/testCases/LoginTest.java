package com.betikaProject.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

    public static void main(String[] args){
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        String url = "https://www.betika.com/en-ke/login";
        driver.get(url);
//        driver.manage().window().maximize();

        WebElement textNumber = driver.findElement(By.xpath("//input[@placeholder='e.g. 0712 234567']"));
        textNumber.sendKeys("0743551248");

//        driver.findElements(By.cssSelector("body > div.app > main > div > div.mobile-router_view-container > div > div > div.session__form > div.session__form__password__container > div > input"))

        WebElement textPassword = driver.findElement(By.xpath("//input[@type='password']"));
        textPassword.sendKeys("1234");

        WebElement loginBtn = driver.findElement(By.className("login"));
        loginBtn.click();



    }
}
