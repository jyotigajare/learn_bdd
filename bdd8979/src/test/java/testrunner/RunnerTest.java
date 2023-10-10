package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:target/report/jpg.json","html:target/report/jpg.html"},




































features= {"Allfeaturefile"},
tags="@tag1",glue= {"stepdefination"},dryRun=false)
public class RunnerTest {

}
