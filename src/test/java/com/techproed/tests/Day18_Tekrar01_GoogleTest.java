package com.techproed.tests;

import com.techproed.pages.Day18_Tekrar01_GooglePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Day18_Tekrar01_GoogleTest extends TestBase {


    @Test
    public void aramaTesti(){

        driver.get("http://google.com");
        Day18_Tekrar01_GooglePage googlePage=new Day18_Tekrar01_GooglePage(driver);
        googlePage.aramaKutusu.sendKeys("Merhabalar");
    }
}
