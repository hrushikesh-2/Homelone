package Runnerfeature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/EMIcalculatorRunner.EMIcalculator",glue={"stepdefinition"})
public class homeloanEMIrun {

}
