package stepDefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

public class exampleSteps {
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


}
