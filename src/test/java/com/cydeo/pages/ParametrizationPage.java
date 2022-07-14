package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParametrizationPage {

    public ParametrizationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="//input[@id='ctl00_MainContent_username']")
    public WebElement Username;

    @FindBy(id="//input[@id='ctl00_MainContent_password']")
    public WebElement Password;

    @FindBy(id="//*[@id=\"ctl00_MainContent_login_button\"]")
    public WebElement login;


    @FindBy(id= "//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]")
    public WebElement fullname;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetPage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityPage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement statePage;

    @FindBy (id = "cctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCodePage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardPage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumPage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement datePage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processPage;


}

