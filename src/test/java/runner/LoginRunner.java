package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sweda\\eclipse-workspace\\Cucumber\\src\\test\\java\\features\\TechFios.feature",
		glue="steps",//package name 
	//	tags="",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
	//where to save		
				"html:target/cucumber.html",
				"json:target/cucumber.json"			
		}
				
		)
public class LoginRunner {

}
