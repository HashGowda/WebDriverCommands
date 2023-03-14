package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;
import java.util.SortedMap;

public class MyInfoPage {
    WebDriver driver;

    public MyInfoPage(WebDriver driver){
        this.driver=DriverManager.getDriver();
    }

    @FindBy(xpath = "(//input)[5]")
    public WebElement nickName;

    @FindBy(xpath = "(//input)[7]")
    public WebElement otherID;

    @FindBy(xpath = "(//i)[6]")
    public WebElement nationality;

    @FindBy(xpath = "(//i)[7]")
    public WebElement maritalStatus;

    @FindBy(xpath = "//label[normalize-space()='Female']")
    public WebElement femaleRadioBtn;

    @FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[text()='-- Select --']")
    public WebElement bloodType;

    public void addData(String nckName, String id, String value, String status, String bldTyp){
        try {
            driver.findElement((By) nickName).sendKeys(nckName);
            driver.findElement((By)otherID).sendKeys(id);
            driver.findElement((By)nationality).sendKeys(value);
            driver.findElement((By)maritalStatus).sendKeys(status);
            driver.findElement((By)femaleRadioBtn).click();
            driver.findElement((By)saveBtn).click();
            driver.findElement((By)bloodType).sendKeys(bldTyp);
        } catch (Exception e){
            System.out.println("Exceptions Caught: "+e.getMessage());
        }
    }
}
