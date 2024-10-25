package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US606Steps {
    DialogContent dc = new DialogContent();
    LeftNav ln= new LeftNav();




    @When("Navigate to Update Contact Info")
    public void navigateToUpdateContactInfo() {
        ln.myClick(ln.updateContactInfo);

    }

    @Then("User should update Contact Info")
    public void userShouldUpdateContactInfo() {

    }

    @And("User should be displayed succes message")
    public void userShouldBeDisplayedSuccesMessage() {
    }

    @Then("User information must be entered incompletely")
    public void userInformationMustBeEnteredIncompletely() {
    }

    @And("User displayed missing info message")
    public void userDisplayedMissingInfoMessage() {
    }
}
