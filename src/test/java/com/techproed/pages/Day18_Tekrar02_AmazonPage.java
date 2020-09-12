package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day18_Tekrar02_AmazonPage {


    WebDriver driver;
    public Day18_Tekrar02_AmazonPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id ="twotabsearchtextbox")
    public WebElement aramaKutusu;

}
