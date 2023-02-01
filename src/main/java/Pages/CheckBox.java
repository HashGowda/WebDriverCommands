package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
    public WebDriver driver;
    CmonFunc cmonFunc;

    public CheckBox(WebDriver driver) {
        this.driver = driver;
        cmonFunc = new CmonFunc(driver);
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//*[text()='Elements']")
        WebElement Element;

        @FindBy(xpath = "(//*[text()='Check Box'])[2]")
        WebElement checkBox;

        @FindBy(className = "rct-checkbox")
        WebElement clickCheckBox;

        public void checkBox(){
            cmonFunc.waitAndClick(Element);
            cmonFunc.waitAndClick(checkBox);
            cmonFunc.waitAndClick(clickCheckBox);
        }
    }

