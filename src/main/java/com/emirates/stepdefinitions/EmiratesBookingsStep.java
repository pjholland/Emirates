package com.emirates.stepdefinitions;
import com.emirates.pageobjects.EmiratesSearchPage;
import com.emirates.resources.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class EmiratesBookingsStep extends BasePage {

    private EmiratesSearchPage emiratesSearchPage;

    @Given("^the customer is on the search flights page$")
    public void the_customer_is_on_the_search_flights_page() throws Throwable {
        emiratesSearchPage = new EmiratesSearchPage();
        emiratesSearchPage.open();
    }

    @When("^the customer enters details for a \"([^\"]*)\" flight$")
    public void the_customer_enters_details_for_a_flight(String arg1) throws Throwable {
      emiratesSearchPage.setOutairport();
      emiratesSearchPage.setReturnairrport();
      emiratesSearchPage.setDepatureDate();
      emiratesSearchPage.setReturnDate();
      emiratesSearchPage.clicksearchbutton();
    }

    @Given("^the current language is set to \"([^\"]*)\"$")
    public void the_current_language_is_set_to(String arg1) throws Throwable {
        emiratesSearchPage.selectLanguage();
    }









}
