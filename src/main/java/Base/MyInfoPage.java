package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPage {

    @FindBy(xpath = "(//input[contains(@class,'oxd-input')])[5]")
    public WebElement nickName;

    @FindBy(xpath = "(//input[contains(@class,'oxd-input')])[7]")
    public WebElement otherID;

    @FindBy(xpath = "(//i[contains(@class,'oxd-icon')])[6]")
    public WebElement nationality;

    @FindBy(xpath = "(//i[contains(@class,'oxd-icon')])[7]")
    public WebElement maritalStatus;

    @FindBy(xpath = "//label[normalize-space()='Female']")
    public WebElement femaleRadioBtn;

    @FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
    public WebElement saveBtn;

    @FindBy(xpath = "(//i[contains(@class,'oxd-icon')])[10]")
    public WebElement bloodType;

    @FindBy(xpath = "(//button[contains(@type,'submit')])[2]")
    public WebElement sveBtn;

}
