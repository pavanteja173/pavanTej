package runnerpackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features= {".//src//test//java"},
		glue="stepdefination",
				tags="@Getbyalcu",
		dryRun=false,
		monochrome=true,
		
		plugin= {
				"pretty","json:target/JSONReports/report.json"                                                                                                                                                                                                                                                                                                                                                                                                        
		}

		)
		

public class Testrunnercucu extends AbstractTestNGCucumberTests{

}
