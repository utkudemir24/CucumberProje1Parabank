package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //US04
    @FindBy(linkText = "Open New Account")
    public WebElement yeniHesap;

    @FindBy(linkText ="Update Contact Info")
    public WebElement updateContactInfo ; //kullanıcı bilgilerini güncelle

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Request Loan']")
    public WebElement requestLoan;

    //US05 Transfer Funds
    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
    public WebElement TransferFundsLink;

    //US03
    @FindBy(xpath = "//a[@href='billpay.htm']")
    public WebElement billpay;

    @FindBy(xpath = "//a[@href='overview.htm']//font//font")
    public WebElement hesapbakiyePaying;

}

