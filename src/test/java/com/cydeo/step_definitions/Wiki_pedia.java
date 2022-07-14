package com.cydeo.step_definitions;

import com.cydeo.pages.Wiki_pediaPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_pedia {

Wiki_pediaPage  wiki_pediaPage= new Wiki_pediaPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("UrlWikipedia"));


    }
        @When("User types {string} in the wiki search box")
        public void user_types_steve_jobs_in_the_wiki_search_box (String name ) {
          wiki_pediaPage.search.sendKeys(name);

        }
        @When("User clicks wiki search button")
        public void user_clicks_wiki_search_button () {
            wiki_pediaPage.submit.click();
        }
        @Then("User sees {string} is in the wiki title")
        public void user_sees_steve_jobs_is_in_the_wiki_title (String name) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(name));
        }

    @Then("User sees {string} is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header(String name) {
        Assert.assertTrue(wiki_pediaPage.header.getText().contains(name));
    }
}
