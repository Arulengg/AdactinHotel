package org.login;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReportingClass {

    public static void report(String args) {

	File file = new File("C:\\Users\\Arulpragasam_M\\eclipse-workspace\\AdactinHotel\\target");

	// CReate object for configuration class

	Configuration configuration = new Configuration(file, "AdactinReport");

	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Version", "104.5");
	configuration.addClassifications("Sprint", "3.0");

	//to add more then one json so we go for list
	
	List<String> li = new ArrayList();
	li.add(args);

	// Call genertae report --Static method 
	//jason file plus usedefined field to combine this to so we go for generatereport.

	ReportBuilder report = new ReportBuilder(li, configuration);
	report.generateReports();

    }

}
