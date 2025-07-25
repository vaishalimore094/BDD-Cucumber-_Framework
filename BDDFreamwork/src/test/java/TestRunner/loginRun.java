package TestRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\Eclipse_setup\\BDDFreamwork\\Features\\log.feature"},
		glue={"StepDefination"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
		)
        
public class loginRun {
	/*this class will be empty*/
}
