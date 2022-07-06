package PageModel;

import Operation.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeModel extends BaseModel {

    public final By btnSignIn = By.xpath("//a[@class='login']");

    public HomeModel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        driver.get(Constants.baseUrl);
        waitForPageLoaded();
    }

    public void clickSignIn() {
        clickElement(btnSignIn);

    }
}
