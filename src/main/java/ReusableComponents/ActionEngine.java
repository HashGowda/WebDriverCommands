package ReusableComponents;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import TestBase.DriverFactory;
import TestBase.ExtentFactory;

public class ActionEngine {

    //Customized sendkeys method --> To log sendkeys message for every occ.
    public void sendKeysCustom(WebElement element, String fieldName, String valueToBeSent){
        try {
            element.sendKeys(valueToBeSent);
            //log success message in extent report
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Entered value as: "+valueToBeSent);
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Value entered in field: "+fieldName+" is failed due to exception"+e);
        }
    }

    //custom click method to log every click action in to extent report
    public void clickCustom(WebElement element, String fieldName){
        try {
            element.click();
            //log success message in extent report
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Clicked successfully");
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "Unable to click on field: "+fieldName+" due to exception: "+e);
        }
    }

    //clear data from field
    public void clearCustom(WebElement element, String fieldName){
        try {
            element.clear();
            Thread.sleep(2000);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Data cleared successfully");
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to clear data on field: "+fieldName+" due to exception: "+e);
        }
    }

    //custom mouseHover
    public void moveToElementCustom(WebElement element, String fieldName){
        try {
            JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
            executor.executeScript("arguments[0].scrollIntoView(true);", element);
            Actions actions = new Actions(DriverFactory.getInstance().getDriver());
            actions.moveToElement(element).build().perform();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Mouse hovered successfully");
            Thread.sleep(2000);
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable to mouse hover on filed: "+fieldName+" due to exception: "+e);
        }
    }

    //check if the element is present
    public boolean isElementPresentCustom(WebElement element, String fieldName){
        boolean flag = false;
        try {
            flag = element.isDisplayed();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Presence of field is:  "+flag);
            return flag;
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Checking for presence of element on field: "+fieldName+" not tested due to exception: "+e);
            return flag;
        }
    }

    //select dropdown by value
    public void dropDownValueCustom(WebElement element, String fieldName, String value){
        try {
            Select s = new Select(element);
            s.selectByValue(value);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Dropdown selected by value: "+value);
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Dropdown is not selected for field: "+fieldName+" due to exception: "+e);
        }
    }

    //String asserts
    public void assertEqualStringCustom(String expValue, String actualValue, String locatorValue){
        try {
            Assert.assertEquals(expValue, actualValue);
            ExtentFactory.getInstance().getExtent().log(Status.PASS, "String assertion is successful on field "+locatorValue+" Expected value: "+expValue);
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "String assertion failed on field: "+locatorValue+" Expected value: "+expValue+" due to exception: "+e);
        }
    }

    //get text from webElement
    public String getTextCustom(WebElement element, String fieldName){
        String text="";
        try {
            text = element.getText();
            ExtentFactory.getInstance().getExtent().log(Status.PASS, fieldName+"==> Text retried is: "+text);
            return text;
        } catch (Exception e){
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, fieldName+"==> Text not retried due to exception: "+e);
        }
        return text;
    }
}
