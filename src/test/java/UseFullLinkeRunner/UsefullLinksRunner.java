package UseFullLinkeRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/usefullLinksFeature",glue={"UseFullLinkeRunner"})


public class UsefullLinksRunner {

}
