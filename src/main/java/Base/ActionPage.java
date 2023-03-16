package Base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ActionPage implements DetailsPage {

    WebDriver driver;
    GenericPage genPage;
    MyInfoPage myInfoPage = new MyInfoPage();;
    LoginPage loginPage = new LoginPage();


    public ActionPage(){
        this.driver= DriverPage.getDriver();
        genPage = new GenericPage(driver);

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, loginPage);
        PageFactory.initElements(driver, myInfoPage);
    }

    public void validLogin(){
        try {
            genPage.sendKeys(loginPage.userName, userName, "Username");
            Reporter.log("Username is entered");
            genPage.sendKeys(loginPage.password, password,"Password");
            Reporter.log("Password is entered");
            genPage.waitAndClick(loginPage.loginBtn,"Login Button");
            Reporter.log("Login Button is clicked");
            genPage.isElementDisplayed(loginPage.myInfo);
            Reporter.log("Element is present on screen");
            genPage.waitAndClick(loginPage.myInfo, "My Info Button");
            Reporter.log("My Info is clicked");
            myInfoTab();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void invalidLogin()  {
        try {
            genPage.sendKeys(loginPage.userName, userName,"Username");
            Reporter.log("Username is entered");
            genPage.sendKeys(loginPage.password, invalidPassword,"Password");
            Reporter.log("Password is entered");
            genPage.waitAndClick(loginPage.loginBtn,"Login Button");
            Reporter.log("Login Button is clicked");
            Reporter.log("Entered incorrect credentials");
            genPage.isElementPresentAssertTrue(loginPage.myInfo);
            Reporter.log("No such element is found");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void myInfoTab() {
        try {
            genPage.sendKeys(myInfoPage.nickName, nickName, "Nickname");
            Reporter.log("Nickname is entered");
            genPage.sendKeys(myInfoPage.otherID, otherID, "OtherID");
            Reporter.log("ID is entered");
            genPage.selectDropdown(myInfoPage.nationality, "India");
            Reporter.log("Nationality is selected");
            genPage.selectDropdown(myInfoPage.maritalStatus, "Other");
            Reporter.log("Marital Status is selected");
            genPage.waitAndClick(myInfoPage.femaleRadioBtn, "Radio Button");
            Reporter.log("Radio Button is selected");
            genPage.scrollDown();
            genPage.waitAndClick(myInfoPage.saveBtn, "Save Button");
            Reporter.log("Save Button is clicked");
            genPage.selectDropdown(myInfoPage.bloodType, "B-");
            Reporter.log("Bolls Type is selected");
            genPage.waitAndClick(myInfoPage.sveBtn, "Save Button");
            genPage.scrollUp();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
