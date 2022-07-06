package PageModel;

import Operation.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginModel extends BaseModel {
    public final By mnuCreateAccount = By.id("create-account_form");
    public final By txtEmailAddress = By.id("email_create");
    public final By btnCreateAccount = By.id("SubmitCreate");
    public final By txtCustomerFirstName = By.id("customer_firstname");
    public final By txtCustomerLastName = By.id("customer_lastname");
    public final By txtCustomerPassword = By.id("passwd");
    public final By txtCustomerAddress = By.id("address1");
    public final By txtCustomerAddressLine = By.id("address2");
    public final By txtCustomerCity = By.id("city");
    public final By cmbCustomerState = By.id("id_state");
    public final By txtCustomerPostCode = By.id("postcode");
    public final By cmbCustomerCountry = By.id("id_country");
    public final By txtCustomerMobilePhone = By.id("phone_mobile");
    public final By txtCustomerAddressAlias = By.id("alias");
    public final By btnSubmitAccount = By.id("submitAccount");
    public final By lblMyAccount = By.xpath("//*[@class='info-account']");
    public final By lblLogOut = By.xpath("//*[@class='logout']");
    public final By tabDresses = By.xpath("(//a[@title='Dresses' and text()='Dresses'])[2]");
    public final By mnuSummerDresses = By.xpath("//*[@class='subcategory-image']//*[@title='Summer Dresses']");
    public final By lblHeaderSummerDress = By.xpath("//*[@class='cat_desc']//*[@class='category-name' and contains(text(),'Summer Dresses')]");

    public LoginModel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        waitForPageLoaded();
    }

    public void verifySignInPageOpened() {
        assertElementIsEnabled(mnuCreateAccount);
        assertElementIsEnabled(txtEmailAddress);
        assertElementIsEnabled(btnCreateAccount);
    }

    public void clickAccount() {
        WebElement emailInput = driver.findElement(txtEmailAddress);
        emailInput.sendKeys(Constants.emailInput);
        clickElement(btnCreateAccount);
        waitForPageLoaded();
        assertElementIsEnabled(txtCustomerFirstName);
        assertElementIsEnabled(btnSubmitAccount);
    }


    public void fillFirstName() {
        fillArea(txtCustomerFirstName, Constants.customerFirstName);
    }

    public void fillLastName() {
        fillArea(txtCustomerLastName, Constants.customerLastName);
    }

    public void fillPassword() {
        fillArea(txtCustomerPassword, Constants.customerPassword);
    }

    public void fillAddress() {
        fillArea(txtCustomerAddress, Constants.customerAddress);
    }

    public void fillAddressLine() {
        fillArea(txtCustomerAddressLine, Constants.customerAddressLine);
    }

    public void fillCustomerCity() {
        fillArea(txtCustomerCity, Constants.customerCity);
    }

    public void fillCustomerState() {
        selectArea(cmbCustomerState, Constants.customerState);
    }

    public void fillCustomerPostCode() {
        fillArea(txtCustomerPostCode, Constants.customerPostCode);
    }

    public void fillCustomerCountry() {
        selectArea(cmbCustomerCountry, Constants.customerCountry);
    }

    public void fillCustomerMobilePhone() {
        fillArea(txtCustomerMobilePhone, Constants.customerPhone);
    }

    public void fillCustomerAddressAlias() {
        fillArea(txtCustomerAddressAlias, Constants.customerAddressAlias);
    }

    public void verifyAccountOperationSuccessfull() {
        assertElementIsEnabled(lblLogOut);
        assertElementIsEnabled(lblMyAccount);
        Assert.assertEquals(driver.findElement(lblMyAccount).getText(), Constants.accountInformation);
    }

    public ProductModel verifyProductPageOpened() {
        assertElementIsEnabled(lblHeaderSummerDress);
        return new ProductModel(driver, wait);
    }
}
