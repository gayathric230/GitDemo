package CucumberTestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/Login.feature",glue= {"StepDefenitions"})
public class TestRunner {

}
