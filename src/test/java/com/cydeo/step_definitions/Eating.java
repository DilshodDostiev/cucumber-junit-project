package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Eating {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("john");
    }
    @When("he eats some cukes")
    public void he_eats_some_cukes() {
        System.out.println("cukes");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("full");
    }

}
