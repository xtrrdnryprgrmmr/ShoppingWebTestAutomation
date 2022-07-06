package PageModel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseModel {

    public WebDriver driver;
    public WebDriverWait wait;

    public BaseModel(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        if (driver.findElement(locator).isDisplayed()) {
            driver.findElement(locator).click();
        }
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void isElementDisplayed(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
    }

    public void assertElementIsEnabled(By element) {
        isElementDisplayed(element);
        Assert.assertTrue(driver.findElement(element).isEnabled());
    }


    public void fillArea(By locator, String text) {
        isElementDisplayed(locator);
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public void selectArea(By locator, String text) {
        Select element = new Select(driver.findElement(locator));
        element.selectByVisibleText(text);
    }
}
