package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class Day13_Tekrar01 extends TestBase {
            // WindowHandleTest

    @Test
    public void cokluPencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String sayfaninHandle = driver.getWindowHandle();
        System.out.println(sayfaninHandle);
        driver.findElement(By.partialLinkText("Click Here")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> tumPenceler = driver.getWindowHandles();
        /*
        elinizdeki tüm pencerelerin windows handle'larını bu şekilde ekrana yazdırabilirsiniz.
        for(String handle : tumPenceler){
            System.out.println(handle);
        }*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object[] array = (Object[]) tumPenceler.toArray();
        String ikinciSayfaHandle = array[array.length - 1].toString();
        System.out.println(ikinciSayfaHandle);
        driver.switchTo().window(sayfaninHandle);
    }

}
