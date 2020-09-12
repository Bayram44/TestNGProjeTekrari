package com.techproed.tests;

import com.techproed.pages.Day18_Tekrar03_FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class Day18_Tekrar03FhcTripLoginTest extends TestBase {

    @Test
    public void loginTest(){
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
        Day18_Tekrar03_FhcTripLoginPage login=new Day18_Tekrar03_FhcTripLoginPage(driver);
        login.userNameKutusu.sendKeys("manager2");
        login.passwordKutusu.sendKeys("Man1ager2!");
        login.buton.click();
    }
}
