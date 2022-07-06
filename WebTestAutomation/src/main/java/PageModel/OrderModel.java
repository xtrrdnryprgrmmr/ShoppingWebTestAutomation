package PageModel;

import Operation.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrderModel extends BaseModel {
    public final By lblSummaryStepMessage = By.xpath("//*[@id='cart_title' and contains(text(),'Shopping-cart summary')]");

    public final By btnSummaryStepSubmit = By.xpath("//*[@title='Proceed to checkout']//*[text()='Proceed to checkout']");
    public final By lblDeliveryAddressOption = By.xpath("//*[text()='Choose a delivery address:']");
    public final By chkAddressesAreEquals = By.xpath("//*[@id='uniform-addressesAreEquals']");
    public final By btnAddressStepSubmit = By.xpath("//*[@name='processAddress']//*[text()='Proceed to checkout']");
    public final By lblTermsOfServiceForShipping = By.xpath("//*[text()='Terms of service']");
    public final By chkTermsOfService = By.xpath("//*[@id='uniform-cgv']/span/*[@id='cgv']");
    public final By btnShippingStepSubmit = By.xpath("//*[@name='processCarrier']//*[contains(text(),'Proceed to checkout')]");
    public final By lblPaymentStepOption = By.xpath("//*[contains(text(),'Please choose your payment method')]");
    public final By mnuPaymentBankWire = By.xpath("//*[@class='payment_module']//*[@class='bankwire' and contains(text(),'Pay by bank wire')]");
    public final By paymentcheck = By.xpath("//*[@class='payment_module']//*[@class='cheque' and contains(text(),'Pay by check')]");

    public final By lblPaymentProductName = By.xpath("//p[@class='product-name']/a");//"//*[@class='product-name']//*[@class='cart_block_product_name']");
    public final By lblPaymentProductQuantity = By.xpath("//*[@class='cart_quantity text-center']//span");

    public final By lblPaymentProductPrice = By.xpath("//*[@class='cart_total']//*[@class='price']");
    public String ProductName = null;
    public String ProductPrice = null;
    public String ProductQuantity = null;
    public final By LblOrderSummary = By.xpath("//*[contains(text(),'Order summary')]");
    public final By btnConfirmOrder = By.xpath("//*[contains(text(),'I confirm my order')]");
    public final By lblOrderConfirmation = By.xpath("//*[@class='page-heading' and contains(text(),'Order confirmation')]");
    public final By lblYourOrderXIsComplete = By.xpath("//*[contains(text(),'Your order on') and contains(text(),'is complete')]");
    public final By mnuViewMyCustomerAccount = By.xpath("//*[@title='View my customer account']");
    public final By mnuOrderHistoryAndDetails = By.xpath("//*[@title='Orders']//*[text()='Order history and details']");

    public final By btnFirstOrder = By.xpath("(//*[@class='color-myaccount'])[1]");
    public final By lblProductNameOrderHistoryAndDetails = By.xpath("//*[@id='order-detail-content']//*[@class='bold']//label");
    public final By lblProductQuantityOrderHistoryAndDetails = By.xpath("//*[@class='return_quantity']/input");
    public final By lblProductPriceOrderHistoryAndDetails = By.xpath("(//td[@class='price']/label)[2]");

    public OrderModel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        waitForPageLoaded();
    }

    public void verifySummaryStepMessage() {
        assertElementIsEnabled(lblSummaryStepMessage);
        Assert.assertTrue(driver.findElement(lblSummaryStepMessage).getText().contains(Constants.shoppingCartSummary));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        assertElementIsEnabled(btnSummaryStepSubmit);
        clickElement(btnSummaryStepSubmit);
    }



    public void verifyAddressStep() {
        assertElementIsEnabled(lblDeliveryAddressOption);
        assertElementIsEnabled(chkAddressesAreEquals);
        clickElement(chkAddressesAreEquals);
        clickElement(btnAddressStepSubmit);
    }

    public void verifyShippingStep() {
        assertElementIsEnabled(lblTermsOfServiceForShipping);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        waitForPageLoaded();
        driver.findElement(chkTermsOfService).click();
        clickElement(btnShippingStepSubmit);

    }

    public void verifyPaymentStep() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        Assert.assertTrue(driver.findElement(lblPaymentStepOption).getText().contains(Constants.paymentMethodMessage));
      //  System.out.println("ProductName s   : " + driver.findElement(lblPaymentProductName).getText());
       // System.out.println("ProductQuantity s  : " + driver.findElement(lblPaymentProductQuantity).getText());
     //   System.out.println("ProductPrice s : " + driver.findElement(lblPaymentProductPrice).getText());
        ProductName = driver.findElement(lblPaymentProductName).getText();
        ProductQuantity = driver.findElement(lblPaymentProductQuantity).getText();
        ProductPrice = driver.findElement(lblPaymentProductPrice).getText();
        clickElement(mnuPaymentBankWire);
    }

    public void verifyOrderSummaryStep() {
        assertElementIsEnabled(LblOrderSummary);
        clickElement(btnConfirmOrder);
    }

    public void verifyOrderConfirmationStep() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        assertElementIsEnabled(lblOrderConfirmation);
        assertElementIsEnabled(lblYourOrderXIsComplete);
    }

    public void verifyOrderHistoryAndDetails() {
        clickElement(mnuViewMyCustomerAccount);
        clickElement(mnuOrderHistoryAndDetails);
    }

    public void verifyOrderCompletedExpected() {
        clickElement(btnFirstOrder);
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        waitForPageLoaded();
       // System.out.println("ProductName z   : " + driver.findElement(lblProductNameOrderHistoryAndDetails).getText());
       // System.out.println("ProductQuantity z  : " + driver.findElement(lblProductQuantityOrderHistoryAndDetails).getAttribute("value"));
        //System.out.println("ProductPrice z : " + driver.findElement(lblProductPriceOrderHistoryAndDetails).getText());
        Assert.assertTrue(driver.findElement(lblProductNameOrderHistoryAndDetails).getText().contains(ProductName));
        Assert.assertTrue(driver.findElement(lblProductQuantityOrderHistoryAndDetails).getAttribute("value").contains(ProductQuantity));
        Assert.assertTrue(driver.findElement(lblProductPriceOrderHistoryAndDetails).getText().contains(ProductPrice));
    }
}