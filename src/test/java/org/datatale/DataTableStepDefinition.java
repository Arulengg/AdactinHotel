package org.datatale;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefinition {

    
    @Given("pre condition")
    public void pre_condition() {
	
	
       
    }

    @When("user enters the data")
    public void user_enters_the_data(io.cucumber.datatable.DataTable dataTable) {

	List<String> asList = dataTable.asList();
	String string = asList.get(0);
	System.out.println(string);
	String string2 = asList.get(1);
	System.out.println(string2);
	String string3 = asList.get(2);
	System.out.println(string3);
    }

    @And("check the data")
    public void check_the_data() {
       
    }

    @Then("Validate the Data")
    public void validate_the_Data() {
     
    }


    
}
