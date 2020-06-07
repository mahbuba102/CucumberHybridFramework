$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "As a QE I want to test Login Feature of USPS",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Successful Login with valid username and password"
    },
    {
      "line": 5,
      "value": "#Given User is on homepage"
    },
    {
      "line": 6,
      "value": "#When user clicks on login link"
    },
    {
      "line": 7,
      "value": "#Then signs in"
    }
  ],
  "line": 8,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer clicks SignIn link on the top of hompage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Customer enters  \"\u003cusername\u003e\" and Customer enters \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Customer clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "login-feature;successful-login-with-valid-username-and-password;;1"
    },
    {
      "cells": [
        "MahbubaNimme2020",
        "Corona2020"
      ],
      "line": 17,
      "id": "login-feature;successful-login-with-valid-username-and-password;;2"
    },
    {
      "cells": [
        "QA2020",
        "Corona2020"
      ],
      "line": 18,
      "id": "login-feature;successful-login-with-valid-username-and-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12892375900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer clicks SignIn link on the top of hompage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Customer enters  \"MahbubaNimme2020\" and Customer enters \"Corona2020\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Customer clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.customer_is_on_Homepage()"
});
formatter.result({
  "duration": 290122500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.customer_clicks_Register_SignIn_link_on_the_top_of_hompage()"
});
formatter.result({
  "duration": 1250189700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MahbubaNimme2020",
      "offset": 18
    },
    {
      "val": "Corona2020",
      "offset": 57
    }
  ],
  "location": "LoginStepDef.customer_enters_and_Customer_enters(String,String)"
});
formatter.result({
  "duration": 1369574000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.customer_clicks_sign_in()"
});
formatter.result({
  "duration": 942017500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.homepage_should_be_shown()"
});
formatter.result({
  "duration": 80800,
  "status": "passed"
});
formatter.after({
  "duration": 871928000,
  "status": "passed"
});
formatter.before({
  "duration": 11156025900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successful login with valid username and password",
  "description": "",
  "id": "login-feature;successful-login-with-valid-username-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Customer is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer clicks SignIn link on the top of hompage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Customer enters  \"QA2020\" and Customer enters \"Corona2020\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Customer clicks sign in",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Homepage should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.customer_is_on_Homepage()"
});
formatter.result({
  "duration": 655500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.customer_clicks_Register_SignIn_link_on_the_top_of_hompage()"
});
formatter.result({
  "duration": 1540205400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA2020",
      "offset": 18
    },
    {
      "val": "Corona2020",
      "offset": 47
    }
  ],
  "location": "LoginStepDef.customer_enters_and_Customer_enters(String,String)"
});
formatter.result({
  "duration": 931877900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.customer_clicks_sign_in()"
});
formatter.result({
  "duration": 1217602100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.homepage_should_be_shown()"
});
formatter.result({
  "duration": 208700,
  "status": "passed"
});
formatter.after({
  "duration": 900836300,
  "status": "passed"
});
});