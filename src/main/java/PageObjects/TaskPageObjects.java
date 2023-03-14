package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPageObjects {

@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement usrName;

@FindBy(xpath = "(//div)[37]")
    WebElement userRole;

@FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement empName;

@FindBy(xpath = "(//div)[53]")
    WebElement status;

@FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchBtn;


public TaskPageObjects(WebDriver driver){
    PageFactory.initElements(driver, this);
}
}
