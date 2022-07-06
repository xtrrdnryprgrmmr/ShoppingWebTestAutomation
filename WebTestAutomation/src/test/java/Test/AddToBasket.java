package Test;

import Operation.Browser;
import PageModel.HomeModel;
import PageModel.LoginModel;
import PageModel.OrderModel;
import PageModel.ProductModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AddToBasket {
    public WebDriver driver;
    public WebDriverWait wait;
    HomeModel homeModel;
    LoginModel loginModel;
    ProductModel productModel;
    OrderModel orderModel;


    @Given("Any browser opens")
    public void launchApplication() throws Throwable {
        driver = Browser.getBrowser("Chrome");
        wait = new WebDriverWait(driver, 25);
        driver.manage().deleteAllCookies();
    }

    @And("AutomationPractice page is visited.")
    public void openPage() {
        homeModel = new HomeModel(driver, wait);
    }

    @And("Click sign in button and verify login page is opened")
    public void clickSignIn() {
        loginModel = new LoginModel(driver, wait);
        homeModel.clickSignIn();
        loginModel.verifySignInPageOpened();
    }

    @And("Click create an account button and verify personal information page is opened")
    public void clickAccount() {
        loginModel.clickAccount();
    }

    @And("User fill First Name area")
    public void fillFirstName() {
        loginModel.fillFirstName();
    }

    @And("User fill Last Name area")
    public void fillLastName() {
        loginModel.fillLastName();
    }

    @And("User fill Password area")
    public void fillPassword() {
        loginModel.fillPassword();
    }

    @And("User fill Address area")
    public void fillAddress() {
        loginModel.fillAddress();
    }

    @And("User fill Address (Line 2)")
    public void fillAddressLine() {
        loginModel.fillAddressLine();
    }

    @And("User fill City")
    public void fillCustomerCity() {
        loginModel.fillCustomerCity();
    }

    @And("User fill State")
    public void fillCustomerState() {
        loginModel.fillCustomerState();
    }

    @And("User fill Postal Code")
    public void fillCustomerPostCode() {
        loginModel.fillCustomerPostCode();
    }

    @And("User fill Country")
    public void fillCustomerCountry() {
        loginModel.fillCustomerCountry();
    }

    @And("User fill Mobile phone")
    public void fillCustomerMobilePhone() {
        loginModel.fillCustomerMobilePhone();
    }

    @And("User fill Assign an address alias for future reference.")
    public void fillCustomerAddressAlias() {
        loginModel.fillCustomerAddressAlias();
    }

    @And("User click Register button")
    public void clickRegisterForNewUser() {
        loginModel.clickElement(loginModel.btnSubmitAccount);
    }

    @And("User see my account page and see firstname lastname in page and sign out button")
    public void verifyAccountOperationSuccessfull() {
        loginModel.verifyAccountOperationSuccessfull();
    }

    @And("Dress tab is selected")
    public void clickDress() {
        loginModel.clickElement(loginModel.tabDresses);
    }

    @And("Summer dress option is selected")
    public void clickSummerDress() {
        productModel = new ProductModel(driver, wait);
        loginModel.clickElement(loginModel.mnuSummerDresses);
        loginModel.verifyProductPageOpened();
    }

    @And("User choose first product and click add to chart button")
    public void addProductToChart() throws InterruptedException {
        productModel.addProductToChart();
    }

    @And("User observe chart pop up is opened and product successfully added to shopping chart")
    public void verifyProductToChartAdded() {
        productModel.verifyProductToChartAdded();
    }


    @And("user observe SHOPPING-CART SUMMARY  - order page is opened and click Proceed to checkout button")
    public void verifySummaryStepMessage() {
        orderModel = new OrderModel(driver, wait);
        orderModel.verifySummaryStepMessage();
    }

    @And("user see adress page is opened and click Proceed to checkout button")
    public void verifyAddressStep() {
        orderModel.verifyAddressStep();
    }

    @And("user see shipping page is opened and click terms of service checkbox")
    public void verifyShippingStep() {
        orderModel.verifyShippingStep();
    }

    @And("user see payment page and chose bank-wire payment option")
    public void verifyPaymentStep() {
        orderModel.verifyPaymentStep();
    }

    @And("user see order summary page is opened and click  I confirm my order button")
    public void verifyOrderSummaryStep() {
        orderModel.verifyOrderSummaryStep();
    }

    @And("user observe ORDER CONFIRMATION page is opened and see order deatils")
    public void verifyOrderConfirmationStep() {
        orderModel.verifyOrderConfirmationStep();
    }

    @And("user click login page and use click order history and details")
    public void verifyOrderHistoryAndDetails() {
        orderModel.verifyOrderHistoryAndDetails();
    }

    @And("user observe completed product order")
    public void verifyOrderCompletedExpected() {
        orderModel.verifyOrderCompletedExpected();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
