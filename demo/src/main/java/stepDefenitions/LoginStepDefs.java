package stepDefenitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

public class LoginStepDefs {
    @Given("^I am on login page$")
    public void iAmOnLoginPage()  {

        System.out.println("I am on login Page");
    }

    @When("^I enter \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnter(String username, String password)  {

        System.out.println("I enter "+username+" Username and "+password+" password");
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton()  {

        System.out.println("I click on submit button");

    }

    @Then("^I will navigate to home page$")
    public void iWillNavigateToHomePage()  {

        System.out.println("Navigated to home page");

    }

    @Then("^\"([^\"]*)\" should be displayed on login screen$")
    public void shouldBeDisplayedOnLoginScreen(String errorMessage)  {

        System.out.println("Error message "+errorMessage+ " is displayed");

    }

    @Then("^Fail this test$")
    public void failThisTest()  {


     //   assertTrue(1 == 2);


    }
}
