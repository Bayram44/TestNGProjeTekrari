package com.techproed.tests;

import com.techproed.pages.Day18_Tekrar04_FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day18_Tekrar04_FhcTripHotelCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }

    @Test
    public void hotelCreate (){
        giris();

        Day18_Tekrar04_FhcTripHotelCreatePage hotelCreatePage=new Day18_Tekrar04_FhcTripHotelCreatePage(driver);
        hotelCreatePage.codeBox.sendKeys("12345");
        hotelCreatePage.nameBox.sendKeys("fghjhg");
        hotelCreatePage.adressBox.sendKeys("shfo5rtjusdnc's");
        hotelCreatePage.phoneBox.sendKeys("239846243985");
        hotelCreatePage.mailBox.sendKeys("öoshiösdhui");
        Select select=new Select(hotelCreatePage.idGroupBox);
        select.selectByIndex(2);
        hotelCreatePage.saveButton.click();
    }
}
