package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[normalize-space()='My Info']")
    public WebElement myInfo;
}

