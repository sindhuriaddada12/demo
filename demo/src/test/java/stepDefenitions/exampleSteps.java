package stepDefenitions;


import com.xray.demo.DemoApplication;
import com.xray.demo.configuration.BaseSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DemoApplication.class, loader = SpringBootContextLoader.class)
@SpringBootTest

public class exampleSteps  extends BaseSteps{


    @Value("${demo.endpoint}")
    String endpoint;

    int firstNumber;
    int secondNumber;
    double result;

    @Given("^I have number \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iHaveNumberAnd(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    @When("^when I perform action \"([^\"]*)\"$")
    public void whenIPerformAction(String arg0) {

        result = firstNumber * secondNumber;
        System.out.println("****************");

    }

    @Then("^I verify result \"([^\"]*)\"$")
    public void iVerifyResult(int result) throws Throwable {
        assertTrue (this.result == result);
    }


    @Given("^test env$")
    public void testEnv()  {

     //   System.out.println("*****************: "+ applicationTestProperties.getEndpoint());
        System.out.println("*****************: "+ endpoint);


    }

    @Test
    public void mad(){
        System.out.println("*****************: "+ getEndpoint());

    }
}
