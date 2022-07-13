package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductModel extends BaseModel {


    public final By imgFirstProduct = By.xpath("(//*[@itemprop='name']//*[@class='product-name'])[1]");//(//*[@class='product-image-container']//*[@class='product_img_link']/img)[1]");
    public final By btnSubmitProduct = By.xpath("//*[@id='add_to_cart']//*[@name='Submit']"); ////*[text()='Add to cart']
    public final By lblProductName = By.xpath("//*[@itemprop='name']");
    public final By lblProductPrice = By.xpath("//*[@itemprop='price' and @id='our_price_display']");
    public final By lblProductQuantity = By.xpath("//*[@id='quantity_wanted']");
    public final By lblTotal = By.xpath("//*[@class='cart_total item']");
    public final By lblVerifiedProductName = By.xpath("//*[@class='cart_description']//*[@class='product-name']");
    public final By lblVerifiedProductQuantity = By.xpath("(//*[@class='cart_quantity text-center']//input[@type='hidden'])");
    public final By lblVerifiedProductPrice = By.xpath("//*[@class='cart_total']//*[@class='price']");
    public final By btnProceedToCheckout = By.xpath("//*[@title='Proceed to checkout']");
    public String ProductName = null;
    public String ProductPrice = null;
    public String ProductQuantity = null;


    public ProductModel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        waitForPageLoaded();
    }

    public void addProductToChart() {

        clickElement(imgFirstProduct);
        ProductName = driver.findElement(lblProductName).getText();
        ProductQuantity = driver.findElement(lblProductQuantity).getAttribute("value");
        ProductPrice = driver.findElement(lblProductPrice).getText();
        clickElement(btnSubmitProduct);
    }

    public void verifyProductToChartAdded() {
        assertElementIsEnabled(btnProceedToCheckout);
        clickElement(btnProceedToCheckout);
        waitForPageLoaded();
        scrollPageElementExist(lblTotal);
        assertElementTextAreEqual(lblVerifiedProductName,ProductName);
        assertAutoCompleteElementTextAreEqual(lblVerifiedProductQuantity,ProductQuantity);
        assertElementTextAreEqual(lblVerifiedProductPrice,ProductPrice);
    }

}
