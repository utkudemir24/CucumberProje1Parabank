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
        dc.mySendKeys(dc.FirstName,"Kadri");
        dc.mySendKeys(dc.LastName,"Kadri");
        dc.mySendKeys(dc.address,"bakırkoy");
        dc.mySendKeys(dc.city,"istanbul");
        dc.mySendKeys(dc.state,"bakırkoy");
        dc.mySendKeys(dc.zipCode,"34153");
        dc.mySendKeys(dc.phoneNumber,"5425240516");
        dc.myClick(dc.updateProfilButton);



    }

    @And("User should be displayed succes message")
    public void userShouldBeDisplayedSuccesMessage() {
        dc.verifyMessageContainsTextINCELEME(dc.profileUpdated,"Your Profile Updated");
    }

    @Then("User information must be entered incompletely")
    public void userInformationMustBeEnteredIncompletely() {
    }

    @And("User displayed missing info message")
    public void userDisplayedMissingInfoMessage() {
    }
}
