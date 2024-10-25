package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    //TeamTester    TeamNine
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement successLoginMessage;
    // US04 Elements
    @FindBy (xpath = "//select[@id='type']")
    public WebElement select;

    @FindBy (xpath = "(//select[@id='type']//option)[1]")
    public WebElement checking;

    @FindBy (xpath = "(//select[@id='type']//option)[2]")
    public WebElement saving;

    @FindBy (xpath = "//input[@type='button']")
    public WebElement newAccountButton;

    @FindBy(xpath = "(//div[@id='openAccountResult']//p)[1]")
    public WebElement AccountSuccessfuly;

    @FindBy(id = "customer.firFirst Name:stName")
    public WebElement FirstName;

    @FindBy (id="customer.lastName")
    public WebElement LastName;

    @FindBy (id="customer.address.street")
    public WebElement address;

    @FindBy (id="customer.address.city")
    public WebElement city;

    @FindBy (id="ustomer.address.state")
    public WebElement state;

    @FindBy (id="customer.address.zipCode")
    public WebElement zipCode;

    @FindBy (id="customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy (xpath = "//input[@value='Update Profile']")
    public WebElement updateProfilButton;

    @FindBy(linkText = "Profile Updated")
    public WebElement profileUpdated;

    @FindBy (linkText = "Address is required.")
    public WebElement missingInformation;



}
