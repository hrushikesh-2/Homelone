package EMIcalculatorRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/EMIfeature",glue={"EMIcalculatorRunner"})
public class EMICalculatorRunner {

}
