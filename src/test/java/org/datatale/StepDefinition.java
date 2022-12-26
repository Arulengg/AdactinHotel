package org.datatale;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    @Given("This is one dimension without Header.")
    public void this_is_one_dimension_without_Header(io.cucumber.datatable.DataTable dataTable)
	    throws UnsupportedEncodingException {

	System.out.println("This is the one dimensional without header");

	List<String> asList = dataTable.asList();
	String string = asList.get(0);
	String string2 = asList.get(1);
	String string3 = asList.get(2);

	System.out.print(string);
	System.out.print(string2);
	System.out.println(string3);
    }

    @When("Its one dimensional with header.")
    public void its_one_dimensional_with_header(io.cucumber.datatable.DataTable dataTable) {

	System.out.println("One dimensional with header");
	Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);

	System.out.println(asMap.get("Name"));
    }

    @When("This Two dimensional with Header.")
    public void this_Two_dimensional_with_Header(io.cucumber.datatable.DataTable dataTable) {

	System.out.println("Two dimensional with header");
	List<Map<String, String>> asMaps = dataTable.asMaps();
	/*
	 * Map<String, String> map = asMaps.get(0); Map<String, String> map2 =
	 * asMaps.get(0);
	 */
	for (int i = 0; i < asMaps.size(); i++) {
	    Map<String, String> map = asMaps.get(i);
	    System.out.println(map.get("Name"));
	    System.out.println(map.get("Company Name"));

	}

    }

    @Then("Two dimensional without Header.")
    public void two_dimensional_without_Header(io.cucumber.datatable.DataTable dataTable) {

	System.out.println("Two dimensional Without Header");
	List<List<String>> asLists = dataTable.asLists();
	System.out.println(asLists.get(0));
	System.out.println(asLists.get(1));

    }

    @And("Data Table is over.")
    public void data_Table_is_over() {

    }

}
