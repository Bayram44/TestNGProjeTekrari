package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day16_Örnek extends TestBase {

    @BeforeMethod
    public void giris(){
        driver.get("http://www.fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }
    @Test
    public void HatelCreate (){

        driver.findElement(By.id("Code")).sendKeys("24362");
        driver.findElement(By.id("Name")).sendKeys("Hasan Huseyin");
        driver.findElement(By.id("Address")).sendKeys("svcsdas sok.14");
        driver.findElement(By.id("Phone")).sendKeys("1-4780572");
        driver.findElement(By.id("Email")).sendKeys("aliddlsd@gmail.com");
        WebElement idGrup= driver.findElement(By.id("IDGroup"));
        Select select=new Select(idGrup);
        select.selectByIndex(1);
        WebElement save= driver.findElement(By.id("btnSubmit"));
        save.click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement basariliYazisi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bootbox-body")));
        Assert.assertTrue(basariliYazisi.isDisplayed());

    }

}
