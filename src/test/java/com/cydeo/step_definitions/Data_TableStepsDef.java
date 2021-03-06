package com.cydeo.step_definitions;

import com.cydeo.pages.DataTableTask6Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Data_TableStepsDef {

    DataTableTask6Page dataTableTask6Page = new DataTableTask6Page();
    Select select = new Select (dataTableTask6Page.month);

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get(ConfigurationReader.getProperty("UrlDropDown"));


    }



    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>Month) {
        for (int i = 0; i < select.getOptions().size(); i++) {
            Assert.assertEquals(select.getOptions().get(i).getText(),Month.get(i));
            System.out.println(select.getOptions().get(i).getText());
        }

            }
    }


