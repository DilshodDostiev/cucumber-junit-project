package com.cydeo.step_definitions;

import com.cydeo.pages.ParametrizationPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Parametrization {

    ParametrizationPage parametrization= new ParametrizationPage();
    Select select= new Select(Driver.getDriver().findElement(By.id("//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));


    @Given(":User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
        parametrization.Username.sendKeys("Tester");
        parametrization.Password.sendKeys("test");
        parametrization.login.click();


    }
    @When(":User selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
    select.selectByVisibleText("FamilyAlbum");
    }
    @When(": User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {
     parametrization.fullname.sendKeys("John Wick");
    }
    @When(": User enters John Wick to costumer name")
    public void user_enters_john_wick_to_costumer_name(){

    }

    @When(":User enters Kinzie Ave to street")
    public void user_enters_kinzie_ave_to_street() {

    }
    @When(":User enters Chicago to city")
    public void user_enters_chicago_to_city() {

    }
    @When(": User enters IL to state")
    public void user_enters_il_to_state() {

    }
    @When(":User enters {int}")
    public void user_enters(Integer int1) {

    }
    @When(":User selects Visa as card type")
    public void user_selects_visa_as_card_type() {

    }
    @When(":User enters {int} to card number")
    public void user_enters_to_card_number(Integer int1) {

    }
    @When(":User enters {int}\\/{int} to expiration date")
    public void user_enters_to_expiration_date(Integer int1, Integer int2) {

    }
    @When(":User clicks process button")
    public void user_clicks_process_button() {

    }
    @Then(": User verifies John Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

    }
}
