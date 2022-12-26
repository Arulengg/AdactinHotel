package org.login;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Arulpragasam_M\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\AdactinHotelApp.feature",
glue = "org.step"
,monochrome=true, plugin ="json:C:\\Users\\Arulpragasam_M\\eclipse-workspace\\AdactinHotel\\target\\report.json")
public class TestRunnerClass {

    @AfterClass
    public static void tc0() {
CucumberReportingClass.report("C:\\Users\\Arulpragasam_M\\eclipse-workspace\\AdactinHotel\\target\\report.json");
	
    }
    
}
