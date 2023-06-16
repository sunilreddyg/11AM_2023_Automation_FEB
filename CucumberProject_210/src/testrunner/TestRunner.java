package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resource/features/userlogin.feature",glue="stepdefination",dryRun=false)
public class TestRunner 
{

}
