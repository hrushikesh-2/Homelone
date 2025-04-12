package ResourceRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Resourcefeature",glue={"ResourceRunner"})


public class ResourceRunner {

}
