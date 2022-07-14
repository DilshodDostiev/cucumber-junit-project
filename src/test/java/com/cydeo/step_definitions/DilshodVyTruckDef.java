package com.cydeo.step_definitions;

import com.cydeo.pages.DilshodVyTuckPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DilshodVyTruckDef {
DilshodVyTuckPage dilshodVyTuckPage = new DilshodVyTuckPage();

    @Given("user is on the Vytrack Login Page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/");
    }
    @When("user enters Username and Password")
    public void user_enters_username_and_password() {
 dilshodVyTuckPage.inputUsername.sendKeys("user166");
 dilshodVyTuckPage.inputPassword.sendKeys("UserUser123");
    }
    @When("user enters submit botton")
    public void user_enters_submit_botton() {
dilshodVyTuckPage.logInButton.click();
    }
    @When("user clicks on Fleet Botton")
    public void user_clicks_on_fleet_botton() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(5);
        actions.moveToElement(dilshodVyTuckPage.fleet).perform();

    }
    @When("user clicks on Vehicles")
    public void user_clicks_on_vehicles() {
        dilshodVyTuckPage.vehicles.click();
    }
    @Then("user should be able to see Grid Settings on the right page.")
    public void user_should_be_able_to_see_grid_settings_on_the_right_page() {
        Assert.assertTrue(dilshodVyTuckPage.gridSettings.isDisplayed());
    }
}
