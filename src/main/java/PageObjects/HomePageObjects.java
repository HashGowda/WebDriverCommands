package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

    WebDriver driver = null;

@FindBy(xpath = "//span[text()='Admin']")
    WebElement adminTab;

@FindBy(xpath = "//span[text()='PIM']")
    WebElement pimTab;

@FindBy(xpath = "//span[text()='Leave']")
    WebElement leaveTab;

@FindBy(xpath = "//span[text()='Time']")
    WebElement timeTab;

@FindBy(xpath = "//span[text()='Recruitment']")
    WebElement recruitmentTab;

@FindBy(xpath = "//span[text()='My Info']")
    WebElement myInfoTab;

@FindBy(xpath = "//span[text()='Performance']")
    WebElement performanceTab;

@FindBy(xpath = "//span[text()='Directory']")
    WebElement directoryTab;

@FindBy(xpath = "//span[text()='Maintenance']")
    WebElement maintenanceTab;

@FindBy(xpath = "//span[text()='Buzz']")
    WebElement buzzTab;

//Initialize all page objects for given driver instance
    public HomePageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Click on Tabs - by passing name of tab
    public void clickOnTabs(String tabName){
        String tabXpath = "//span[text()='"+tabName+"']";
        driver.findElement(By.xpath(tabXpath)).click();
    }

    //

}
