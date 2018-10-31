package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty" ,"html:target/cucumber.html" ,
                "json:target/cucumber-report.json" ,
                "junit:target/cucumber.xml"},
        glue = {"stepDefenitions"},



        features = "src/main/resources/features",
        tags = {"@login"},

        monochrome = true
)

public class exampleTestRunner {
}
