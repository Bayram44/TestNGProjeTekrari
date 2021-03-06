package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day18_Tekrar04_FhcTripHotelCreatePage {

    WebDriver driver;

    public Day18_Tekrar04_FhcTripHotelCreatePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="Code")
    public WebElement codeBox;

    @FindBy(id="Name")
    public WebElement nameBox;

    @FindBy(id="Address")
    public WebElement adressBox;

    @FindBy(id="Phone")
    public WebElement phoneBox;

    @FindBy(id="Email")
    public WebElement mailBox;

    @FindBy(id="IDGroup")
    public WebElement idGroupBox;

    @FindBy(id="btnSubmit")
    public WebElement saveButton;


}
