package Base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ActionPage implements DetailsPage {

    WebDriver driver;
    GenericPage genPage;
    MyInfoPage myInfoPage = new MyInfoPage();;
    LoginPage loginPage = new LoginPage();
//    private WebElement loginBtn;
//    private WebElement myInfo;

    public ActionPage(){
        this.driver= DriverPage.getDriver();
        genPage = new GenericPage(driver);

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, loginPage);
        PageFactory.initElements(driver, myInfoPage);
    }

    public void validLogin() throws InterruptedException{
        try {
            genPage.sendKeys(loginPage.userName, userName, "Username");
            Reporter.log("Username is entered");
            genPage.sendKeys(loginPage.password, password,"Password");
            Reporter.log("Password is entered");
            genPage.waitAndClick(loginPage.loginBtn,"Login Button");
            Reporter.log("Login Button is clicked");
            genPage.waitAndClick(loginPage.myInfo, "My Info Button");
            Reporter.log("My Info tab is clicked");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void invalidLogin() throws InterruptedException {
        try {
            genPage.sendKeys(loginPage.userName, userName,"Username");
            genPage.sendKeys(loginPage.password, invalidPassword,"Password");
            genPage.waitAndClick(loginPage.loginBtn,"Login Button");
            Reporter.log("Entered incorrect credentials");
            genPage.isElementPresentAssertTrue(loginPage.myInfo);
            Reporter.log("No such element is found");
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void myInfoTab() throws InterruptedException{
        try {
            genPage.sendKeys(myInfoPage.nickName, nickName, "Nickname");
            Reporter.log("Nick is entered");
            genPage.sendKeys(myInfoPage.otherID, otherID, "OtherID");
            Reporter.log("ID is entered");
            genPage.selectDropdown(myInfoPage.nationality, "Nationality");
            Reporter.log("Nationality is selected");
            genPage.selectDropdown(myInfoPage.maritalStatus, "Marital Status");
            Reporter.log("Marital Status is selected");
            genPage.waitAndClick(myInfoPage.femaleRadioBtn, "Radio Button");
            Reporter.log("Radio Button is selected");
            genPage.waitAndClick(myInfoPage.saveBtn, "Save Button");
            Reporter.log("Save Button is clicked");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
