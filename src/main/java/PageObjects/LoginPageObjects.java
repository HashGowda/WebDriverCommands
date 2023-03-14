package PageObjects;

import org.openqa.selenium.By;
import TestBase.DriverFactory;
import TestBase.TestBase;

public class LoginPageObjects extends TestBase {

    By userName = By.name("username");
    By password = By.name("password");
    By loginBtn  = By.xpath("//button[normalize-space()='Login']");


//    @FindBy(name = "username")
//    WebElement userName;
//
//    @FindBy(name = "password")
//    WebElement password;
//
//    @FindBy(xpath = "//button[normalize-space()='Login']")
//    WebElement loginBtn;

    //Initialize all page objects for given driver instance
//    public LoginPageObjects(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }

    //Login to App
    public void login(String usrNme, String pwd) {
        sendKeysCustom(DriverFactory.getInstance().getDriver().findElement(userName),"User Name Field", usrNme);
        sendKeysCustom(DriverFactory.getInstance().getDriver().findElement(password),"Password Field", pwd);
        clickCustom(DriverFactory.getInstance().getDriver().findElement(loginBtn),"Login Button");


//        userName.sendKeys(usrNme);
//        password.sendKeys(pwd);
//        loginBtn.click();
    }

}
