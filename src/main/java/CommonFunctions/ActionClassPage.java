package CommonFunctions;

import Objects.DriverPage;
import Objects.ExtentLogger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ActionClassPage {
    public WebDriver driver;

    public ActionClassPage(WebDriver driver){
        this.driver= DriverPage.getDriver();
    }

    public void sendKeys(WebElement element, String data, String elementName){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(data);
            Thread.sleep(2000);
            ExtentLogger.info(elementName+" is entered: "+data);
        } catch (Exception e){
            System.out.println("Unable to find element "+element);
            e.printStackTrace();
        }
    }

    public void waitTillTheElementIsClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitAndClick(WebElement element, String elementName){
        waitTillTheElementIsClickable(element);
        element.click();
        ExtentLogger.info(elementName+" is clicked");
    }

    public void acceptAlerts(){
        try {
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
        } catch (Exception e){
            System.out.println("Exceptions Caught "+e.getMessage());
        }
    }

    public void selectDropdown(WebElement element, String value){
        try {
            Select select = new Select(element);
            select.selectByValue(value);
            ExtentLogger.info("Selected dropdown has been selected");
            System.out.println(value+" is selected");
        } catch (Exception e){
            ExtentLogger.info("Selected dropdown is not found");
            System.out.println(value+" is not found");
        }
    }

    public boolean isElementDisplayed(WebElement locator){
        try {
            if (locator.isDisplayed())
                System.out.println("Element is present on scree "+locator);
            return  true;
        } catch (NoSuchElementException e){
            System.out.println("Element is not present on screen "+locator);
            return false;
        }
    }

    public boolean isElementPresentAssertTrue(WebElement element){
        try {
            Assert.assertTrue(isElementDisplayed(element));
        } catch (Exception e){
            System.out.println("Element is not found, Assertion failed");
        }
        return false;
    }

    public void scrollDown(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1500)","");
    }

    public void scrollUp(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,-1500)","");
    }

//    public void customSendKeys(WebElement element, String fieldName, String valueToBeSent){
//        try {
//            element.sendKeys(valueToBeSent);
//            //log success message in extent report
//            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Entered value as: "+valueToBeSent);
//        } catch (Exception e){
//            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Value entered in field: "+fieldName+" is failed due to exception"+e);
//        }
//    }
//
//    public void selectDropdown(WebElement element, String fieldName, String value){
//        try {
//            Select s = new Select(element);
//            s.selectByValue(value);
//            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Dropdown selected by value: "+value);
//        } catch (Exception e){
//            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown is not selected for field: "+fieldName+" due to exception: "+e);
//        }
//        }
//    }

}
