$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Arulpragasam_M/eclipse-workspace/AdactinHotel/src/test/resources/AdactinHotelApp.feature");
formatter.feature({
  "name": "Automate the AdactinHomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open the Adactin url",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks the Login button",
  "keyword": "Then "
});
formatter.step({
  "name": "Login Succefull",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Arulpragasam",
        "Arulgreat@7"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate the Login Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open the Adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDefinition.open_the_Adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"Arulpragasam\" and \"Arulgreat@7\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_clicks_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Succefull",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.login_Succefull()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select the \"\u003clocation\u003e\" and \"\u003cHotels\u003e\" and \"\u003cRoomType\u003e\" and \"\u003cNumber of Rooms\u003e\" and \"\u003cCheck in Date\u003e\" and \"\u003cCheck out Date\u003e\" and \"\u003cAdults Room\u003e\" and \"\u003cChildren per room\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click search button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "Hotels",
        "RoomType",
        "Number of Rooms",
        "Check in Date",
        "Check out Date",
        "Adults Room",
        "Children per room"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Creek",
        "Standard",
        "2 - Two",
        "01/02/2022",
        "02/02/2022",
        "3 - Three",
        "4 - Four"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select the \"Sydney\" and \"Creek\" and \"Standard\" and \"2 - Two\" and \"01/02/2022\" and \"02/02/2022\" and \"3 - Three\" and \"4 - Four\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_the_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Select Hotel Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Select the Hotel",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.user_Select_the_Hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify the Book A Hotel Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select \"\u003cFirst name\u003e\" and \"\u003cLast Name\u003e\" and \"\u003cBilling Address\u003e\" and  \"\u003cCredit Card Number\u003e\"and \"\u003cCredit Card Type\u003e\" and \"\u003cSelect Month\u003e\" and  \"\u003cSelect Year\u003e\" and  \"\u003cCVV Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click Book now button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First name",
        "Last Name",
        "Billing Address",
        "Credit Card Number",
        "Credit Card Type",
        "Select Month",
        "Select Year",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "Arulpragasam",
        "Mathiyalagan",
        "Andipalayam",
        "12345678901234567",
        "VISA",
        "January",
        "2020",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the Book A Hotel Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select \"Arulpragasam\" and \"Mathiyalagan\" and \"Andipalayam\" and  \"12345678901234567\"and \"VISA\" and \"January\" and  \"2020\" and  \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.user_select_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.click_Book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking Confirmation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter the book now button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.user_enter_the_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the order ID",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.verify_the_order_ID()"
});
formatter.result({
  "status": "passed"
});
});