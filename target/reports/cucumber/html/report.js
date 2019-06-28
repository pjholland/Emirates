$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchpage.feature");
formatter.feature({
  "line": 2,
  "name": "Search Page",
  "description": "\r\n      In order to maintain an on-line booking\r\n      I want to visit the search page\r\n      So that visitors can book my fights from a variaty of options",
  "id": "search-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "The customer is able to user is able to search for a flight",
  "description": "",
  "id": "search-page;the-customer-is-able-to-user-is-able-to-search-for-a-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@current"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the customer is on the search flights page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "the customer enters details for a \"return\" flightSce",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});