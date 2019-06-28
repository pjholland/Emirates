
Feature: Search Page

        In order to maintain an on-line booking
        I want to visit the search page
        So that visitors can book my fights from a variety of options


      @current
        Scenario: The customer is able to user is able to search for a flight
            Given the customer is on the search flights page
            And the current language is set to "English"
            When the customer enters details for a "return" flight
            Then the customer is presented with a list of flight options



