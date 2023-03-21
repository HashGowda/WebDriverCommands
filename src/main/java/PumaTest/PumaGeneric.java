package PumaTest;

import Base.GenericPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PumaGeneric {
    public WebDriver driver;

    public PumaGeneric(WebDriver driver) {
        this.driver = PumaDriver.getDriver();
    }

    public void sendKeys(WebElement element, String data, String ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(data);
            PumaExtentLogger.info(ele + " is entered: " + data);
        } catch (Exception e) {
            System.out.println("Unable to find an element: " + element);
            e.printStackTrace();
        }
    }

    public void waitTillTheElementIsClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitAndClick(WebElement element, String elementName) {
        waitTillTheElementIsClickable(element);
        element.click();
        PumaExtentLogger.info(elementName + " is clicked");
    }

    public void acceptAlerts() {
        try {
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("Exceptions caught: " + e.getMessage());
        }
    }

    public void selectDropdown(WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByValue(value);
            PumaExtentLogger.info(value + " is selected");
        } catch (Exception e) {
            PumaExtentLogger.info(value + " is not selected");
        }
    }

    public boolean isElementDisplayed(WebElement locator) {
        try {
            if (locator.isDisplayed())
                System.out.println(locator + " is present on screen");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(locator + " is not present on screen");
            return false;
        }
    }

    public boolean isElementPresentAssertTrue(WebElement element) {
        try {
            Assert.assertTrue(isElementDisplayed(element));
            System.out.println("Element is found, Assertion success");
        } catch (Exception e) {
            System.out.println("Element is not found, Assertion failed");
        }
        return false;
    }

    public void scrollDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, 1500)", "");
    }

    public void scrollUp() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0, -1500)", "");
    }

}
