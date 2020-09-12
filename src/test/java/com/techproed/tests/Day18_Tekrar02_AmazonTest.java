package com.techproed.tests;

import com.techproed.pages.Day18_Tekrar02_AmazonPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class Day18_Tekrar02_AmazonTest extends TestBase {

    @Test
    public void amazonTest(){
        driver.get("http://amazon.com");
        Day18_Tekrar02_AmazonPage amazon=new Day18_Tekrar02_AmazonPage(driver);

        amazon.aramaKutusu.sendKeys("49 inch monitör");
    }
}
