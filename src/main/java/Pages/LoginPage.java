package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By userName = By.id("userName");

    By password = By.id("password");

    By loginBtn = By.id("login");

    public void enterUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
