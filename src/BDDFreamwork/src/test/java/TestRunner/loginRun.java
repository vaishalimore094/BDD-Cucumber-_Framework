package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		tags="",features= {"/BDDFreamwork/Features"},
		glue= {"/src/test/java/StepDefination"},
		plugin= {"pretty","html:target/htmlreport.html"})
public class loginRun extends AbstractTestNGCucumberTests{
	/*this class will be empty*/
}
