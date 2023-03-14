package Objects;

import CommonFunctions.ActionClassPage;
import PageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.sql.DriverManager;

public class ActionPage implements DetailsPage {

    WebDriver driver;
    ActionClassPage actn;
    ActionPage actionPageObj = new ActionPage();

    public ActionPage(){
        this.driver= DriverManager.getDriver();
        actn = new ActionClassPage(driver);

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, loginPageObjects);
    }

    public void validLogin() throws InterruptedException {
        actn.sendKeys(loginPageObjects.userName, userName, "Username");
        Reporter.log("Username is entered");
        actn.sendKeys(loginPageObjects.password, password,"Password");
        Reporter.log("Password is entered");
        actn.waitAndClick(loginPageObjects.loginBtn,"Login Button");
        Reporter.log("Login Button is clicked");
    }

//    public void invalidLogin() throws InterruptedException {
//        actn.sendKeys(loginPageObjects.userName, userName,"Username");
//        actn.sendKeys(loginPageObjects.password, invalidPassword,"Password");
//        actn.waitAndClick(loginPageObjects.loginBtn,"Login Button");
//        Reporter.log("Entered incorrect credentials");
//        actn.isElementPresentAssertTrue(loginPageObjects.myInfo);
//    }
}
