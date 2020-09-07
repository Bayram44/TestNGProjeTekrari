package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day12_Tekrar02 {
            // IframeTest

    private WebDriver driver;

    @BeforeClass
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest1(){
        // index ile iframe'e gecis yapacagiz

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement pragraf= driver.findElement(By.xpath("//p"));
        String iframeYazi=pragraf.getText();
        System.out.println(iframeYazi);
        pragraf.clear();
        pragraf.sendKeys("Merhaba iframe1");
    }

    @Test

    public void iframeTest2(){
        // id attribute'u ile iframe gecis yapacagiz
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement pragraf= driver.findElement(By.xpath("//p"));
        String iframeYazi=pragraf.getText();
        System.out.println(iframeYazi);
        pragraf.clear();
        pragraf.sendKeys("Merhaba iframe2");
    }

    @Test
    public void iframeTest3(){
        // iframe'in webelementini bularak iframe'e gecis yapacagiz
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement element= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(element);
        WebElement pragraf= driver.findElement(By.xpath("//p"));
        String iframeYazi=pragraf.getText();
        System.out.println(iframeYazi);
        pragraf.clear();
        pragraf.sendKeys("Merhaba iframe3");
    }

    @Test
    public void iframeTest4(){
        // index ile iframe'e gecis yapacagiz

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement pragraf= driver.findElement(By.xpath("//p"));
        String iframeYazi=pragraf.getText();
        System.out.println(iframeYazi);
        pragraf.clear();
        pragraf.sendKeys("Merhaba iframe4");

        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        WebElement link= driver.findElement(By.partialLinkText("Elemental"));
        link.click();
    }
}
