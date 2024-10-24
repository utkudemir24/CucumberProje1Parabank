package StepDefinitions;

import Pages._601_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    _601_DialogContent dc = new _601_DialogContent();
    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName, "TeamNine");
        dc.mySendKeys(dc.password,"TeamTester");
        dc.myClick(dc.loginButton);
    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.LoginContainsText(dc.successLoginMessage,"Welcome");
    }
}
