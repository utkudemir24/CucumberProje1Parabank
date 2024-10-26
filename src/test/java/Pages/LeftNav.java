package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(linkText = "Open New Account")
    public WebElement yeniHesap;

    @FindBy(linkText ="Update Contact Info")
    public WebElement updateContactInfo ; //kullanıcı bilgilerini güncelle

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Request Loan']")
    public WebElement requestLoan;
}

