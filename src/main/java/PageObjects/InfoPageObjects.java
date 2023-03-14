package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPageObjects {

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
    WebElement otherId;

    @FindBy(xpath = "(//*[@class='oxd-select-text--after'])[1]")
    WebElement nationality;

    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement radioBtn;

    @FindBy(xpath = "(//*[@class='oxd-select-text--after'])[3]")
    WebElement bloodType;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    WebElement saveBtn;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    WebElement sveBtn;

    public InfoPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
