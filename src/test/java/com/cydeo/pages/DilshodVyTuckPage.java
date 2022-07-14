package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DilshodVyTuckPage {

    public DilshodVyTuckPage(){


        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "_username")
    public WebElement inputUsername;

    @FindBy(name = "_password")
    public WebElement inputPassword;

    @FindBy(name = "_submit")
    public WebElement logInButton;
    @FindBy(xpath = "(//a[@class='unclickable'])[1]")
    public WebElement fleet;


    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']//li)[3]")
    public WebElement vehicles;


    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettings;


}
