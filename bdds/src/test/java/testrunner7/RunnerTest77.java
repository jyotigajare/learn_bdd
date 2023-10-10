package testrunner7;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
dryRun = false,
features={"Allfeaturefile77"},glue= {"stepdefination"},plugin= {"html:target/report/jyoti7.html"}
)
public class RunnerTest77 {
}

	
	


