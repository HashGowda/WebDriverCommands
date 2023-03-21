package PumaFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenFunctions {

    public WebDriver driver;
    public GenFunctions(WebDriver driver){
        this.driver=driver;
    }

    public void sendKeys(WebElement element, String data){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(data);
    }

    public void waitForElement(WebElement element){
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitAndClick(WebElement element){
        waitForElement(element);
        element.click();
    }

    public void selectDropdown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByValue(text);
    }

    public void acceptAlerts(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void scrollDown(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1500)","");
    }
    public void scrollUp(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,-1500)","");
    }

    public boolean isElementPresent(WebElement locator){
        try {
            if (locator.isDisplayed())
                System.out.println(locator+" is present on screen");
            return true;
        } catch (Exception e){
            System.out.println(locator+" is not present in screen");
            return false;
        }
    }

}
