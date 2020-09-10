package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Day17_Tekrar01 extends TestBase {

    public void giris() {
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void table() {

        giris();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());

        List<WebElement> tumBasliklar = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement baslik : tumBasliklar) {
            System.out.println(baslik.getText());
        }

    }

    @Test
    public void tumSatirlar() {

        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> tumSatirlar = driver.findElements(By.xpath("//tbody/tr"));

        for (WebElement satirlar : tumSatirlar) {
            System.out.println(satirlar.getText());
        }
    }

    @Test
    public void tumHucreler() {

        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> hucreler = driver.findElements(By.xpath("//tbody/tr/td"));

        for (WebElement hucre : hucreler) {
            System.out.println(hucre.getText());
        }
    }

    @Test
    public void nameSutunu (){

        giris();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> nameSutun=driver.findElements(By.xpath("//tbody/tr/td[4]"));

        for (WebElement sutunName:nameSutun){
            System.out.println(sutunName.getText());
        }
    }

    @Test
    public void hucre (){

        giris();
        hucreCagir(3,5);
        hucreCagir(5,5);
        hucreCagir(4,4);
        hucreCagir(9,4);


    }

    public void hucreCagir(int satir, int sutun){

        String xpathDegeri="//tbody/tr["+   satir   +"]/td["+   sutun   +"]";

        WebElement hucre= driver.findElement(By.xpath(xpathDegeri));
        System.out.println(hucre.getText());
    }
}
