package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_Örnek extends TestBase {

    @Test
    public void test01(){
        driver.get("http://amazon.com");

        WebElement account = driver.findElement(By.id("nav-link-accountList"));
        Actions actions =new Actions(driver);
        actions.moveToElement(account).perform();


        WebElement startHere=driver.findElement(By.partialLinkText("Start here."));
        actions.moveToElement(startHere).click().perform();

        String otsikko= driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");
    }

    @Test (dependsOnMethods = "test01")
    public void test02(){

        WebElement name= driver.findElement(By.id("ap_customer_name"));
        name.sendKeys("AH SELENIUM");

        driver.findElement(By.id("ap_email")).sendKeys("kalaalak@gmail.com");

        driver.findElement(By.id("ap_password")).sendKeys("AKL09.87");

        driver.findElement(By.id("ap_password_check")).sendKeys("AKL09.87");

        driver.findElement(By.id("continue")).click();

    }

}
