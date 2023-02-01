package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;
    CmonFunc cmonFunc;

    public MainPage(WebDriver driver){
        this.driver=driver;
        cmonFunc = new CmonFunc(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Elements']")
    WebElement Element;

    @FindBy(xpath = "//*[text()='Text Box']")
    WebElement textBox;

    @FindBy(id = "userName")
    WebElement fullName;

    @FindBy(id = "userEmail")
    WebElement emailId;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitBtn;


    public void mainPage(){
        cmonFunc.waitAndClick(Element);
        cmonFunc.waitAndClick(textBox);
        cmonFunc.sendKeys(fullName,"Testuser");
        cmonFunc.sendKeys(emailId,"testuser@gmail.com");
        cmonFunc.sendKeys(currentAddress,"Bangalore");
        cmonFunc.sendKeys(permanentAddress,"Delhi");
        cmonFunc.waitAndClick(submitBtn);
    }
}
