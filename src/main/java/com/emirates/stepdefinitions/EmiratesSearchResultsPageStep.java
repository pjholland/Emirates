package com.emirates.stepdefinitions;

import com.emirates.pageobjects.EmiratesSearchPage;
import com.emirates.pageobjects.EmiratesSearchResultsPage;
import com.emirates.resources.BasePage;
import cucumber.api.java.en.Then;

public class EmiratesSearchResultsPageStep extends BasePage {

    private EmiratesSearchResultsPage emiratesSearchResultsPage;

    @Then("^the customer is presented with a list of flight options$")
    public void the_customer_is_presented_with_a_list_of_flight_options() throws Throwable {
        emiratesSearchResultsPage = new EmiratesSearchResultsPage();
        elementHasText(BasePage.Locators.id, emiratesSearchResultsPage.shoppingBasketElement, "London (LON) to Dubai (DXB)");
    }
}
