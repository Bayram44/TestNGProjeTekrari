package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Day11_Tekrar03 {
            //SSoftAssertTestClass

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        SoftAssert softAssert=new SoftAssert();
        driver.get("http://amazon.com");

    }

    @Test
    public void test02(){
        driver.get("http://a.testaddressbook.com/sign_in");
        SoftAssert softAssert=new SoftAssert();

        //1. adim da email kutusunu bulup adresi kutuya gönderdik ve daha sonra kutudaki adres gönderdigimiz adres mi diye dogruladik.
        WebElement emailBox= driver.findElement(By.name("session[email]"));
        emailBox.sendKeys("testtechproed@gmail.com");
        softAssert.assertTrue(emailBox.getText().equals("testtechproed@gmail.com"));

        //2. adim da sifre kutusunu bulup sifreyi kutuya gönderdik ve daha sonra kutudaki sifre gönderdigimiz sifre mi diye dogruladik.
        WebElement pinBox= driver.findElement(By.id("session_password"));
        pinBox.sendKeys("Test1234!");
        softAssert.assertTrue(pinBox.getText().equals("Test1234!"));

        WebElement signInButton= driver.findElement(By.name("commit"));
        signInButton.click();

        WebElement signOut= driver.findElement(By.partialLinkText("Sign out"));
        boolean görunuyorMu=signOut.isDisplayed();

        softAssert.assertAll();

    }

}
