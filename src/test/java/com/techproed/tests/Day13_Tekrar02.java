package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class Day13_Tekrar02 extends TestBase {

    @Test

    public void sagTiklama(){

        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);

        actions.contextClick(element).perform();
    }

    @Test

    public void ciftTiklama(){

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        Actions actions=new Actions(driver);
        actions.doubleClick(element).perform();
    }

    @Test
    public void hoverOver(){
        driver.get("http://amazon.com");

        WebElement element = driver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }
    @Test
    public void asagiYukari(){
        driver.get("http://amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.END).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.ARROW_UP);
    }

    @Test
    public void buyukKucukYazma(){
        driver.get("http://google.com");

        WebElement searchBox=driver.findElement(By.name("q"));

        //bu sekilde her karateri buyuk yapar
        //searchBox.sendKeys(Keys.SHIFT+"amazon");


        Actions actions =new Actions(driver);
        actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("merhaba").keyUp(Keys.SHIFT).sendKeys(" nasilsiniz").perform();
    }

    @Test
    public void dragAndDrop(){
        driver.get("http://google.com");

        WebElement searchBox=driver.findElement(By.name("q"));

        WebElement logo= driver.findElement(By.id("hplogo"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(logo,searchBox).perform();
    }


}
