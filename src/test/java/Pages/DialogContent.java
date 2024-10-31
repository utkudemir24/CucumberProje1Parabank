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

    //US07 Elements
    public WebElement loanAmountBox;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPaymentBox;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccountDropDown;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//td[@id='loanProviderName']")
    public WebElement loanProvider;

    @FindBy(xpath = "//td[@id='loanStatus']")
    public WebElement loanStatus;

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountNumberLink;

    @FindBy(xpath = "//p[contains(text(),'approved')]")
    public WebElement approvalMessage;

    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;

    @FindBy(xpath = "//td[@id='accountType']")
    public WebElement accountType;

    @FindBy(xpath = "//td[@id='balance']")
    public WebElement accountBalance;

    @FindBy(xpath = "//td[@id='availableBalance']")
    public WebElement accountAvailableBalance;

    @FindBy(xpath = "//b[.='No transactions found.']")
    public WebElement transactionsMessage;


    //Paying Bilss(US603)
    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernamePaying;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordPaying;

    @FindBy(xpath = "(//div[@class='login'])[3]/input")
    public WebElement buttonPaying;

    @FindBy(xpath = "//div[@id='billpayForm']/h1")
    public WebElement succesMessagePaying;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payenamePaying;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public  WebElement adressPaying;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public  WebElement cityPaying;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public  WebElement statePaying;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public  WebElement zipcodePaying;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public  WebElement numberPaying;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public  WebElement accountPaying;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public  WebElement verifyaccountPaying;

    @FindBy(xpath = "//input[@name='amount']")
    public  WebElement amountPaying;

    @FindBy(xpath = "//select[@name='fromAccountId']")
    public  WebElement fromPaying;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public  WebElement sendpaymentPaying;

    @FindBy(xpath = "//div[@id='billpayResult']/h1")
    public WebElement successMessageodemetamamPaying;

}
