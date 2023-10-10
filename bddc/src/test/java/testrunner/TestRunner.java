package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( dryRun=true, features= {"Allfeaturefile"},plugin= {"html:target/report/jyogajare.html"})
public class TestRunner {

	
	}


