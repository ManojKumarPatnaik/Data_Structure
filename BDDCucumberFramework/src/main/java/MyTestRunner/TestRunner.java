package MyTestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Data Structure\\BDDCucumberFramework\\src\\main\\java\\Features", //the path of the feature files
		glue={"StepDefinitions"} //the path of the step definition files
		//format= {"pretty","html:test-outout"}		
		)


public class TestRunner {

}