package PumaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PumaAction implements PumaDetails {

    WebDriver driver;
    PumaGeneric pumaGen;
    PumaLogin pumaLogin = new PumaLogin();


    public PumaAction(){
        this.driver= PumaDriver.getDriver();
        pumaGen = new PumaGeneric(driver);

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, pumaLogin);

    }

    public void pumaSearchPage(){
        try {
            pumaGen.sendKeys(pumaLogin.searchBox, searchBox, "Search Box");
            Reporter.log("Input entered in search box");
            pumaGen.waitAndClick(pumaLogin.size,"Size");
            pumaGen.selectDropdown(pumaLogin.size, "8");
            Reporter.log("Size is selected");
            pumaGen.waitAndClick(pumaLogin.gender,"Gender");
            pumaGen.selectDropdown(pumaLogin.gender, "Male");
            Reporter.log("Gender is selected");
            pumaGen.waitAndClick(pumaLogin.sport,"Sport");
            pumaGen.selectDropdown(pumaLogin.sport, "Cricket");
            Reporter.log("Sport is selected");
            pumaGen.waitAndClick(pumaLogin.category,"Category");
            pumaGen.selectDropdown(pumaLogin.category, "Footwear");
            Reporter.log("Category is selected");
            pumaGen.waitAndClick(pumaLogin.color,"Color");
            pumaGen.selectDropdown(pumaLogin.size, "Black");
            Reporter.log("Color is selected");
            pumaGen.waitAndClick(pumaLogin.price,"Price");
            pumaGen.selectDropdown(pumaLogin.size, "(1000..3000)");
            Reporter.log("Price is selected");
            pumaGen.isElementDisplayed(pumaLogin.men);
            Reporter.log("Men is present on screen");
            pumaGen.scrollDown();
            pumaGen.scrollUp();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

//    public void invalidLogin()  {
//        try {
//            pumaGen.sendKeys(pumaLogin.userName, userName,"Username");
//            Reporter.log("Username is entered");
//            pumaGen.sendKeys(pumaLogin.password, invalidPassword,"Password");
//            Reporter.log("Password is entered");
//            pumaGen.waitAndClick(pumaLogin.loginBtn,"Login Button");
//            Reporter.log("Login Button is clicked");
//            Reporter.log("Entered incorrect credentials");
//            pumaGen.isElementPresentAssertTrue(pumaLogin.myInfo);
//            Reporter.log("No such element is found");
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

}
