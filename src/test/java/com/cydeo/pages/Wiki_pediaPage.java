package com.cydeo.pages;

import com.cydeo.step_definitions.Wiki_pedia;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wiki_pediaPage {

    public Wiki_pediaPage () {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//input[@id='searchInput']")
    public WebElement search;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;


    @FindBy(xpath = "//h1[.='Steve Jobs']")
    public WebElement header;


}