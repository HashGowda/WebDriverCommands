package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    By LoginBtn = By.id("login");

    public void clickLogin(){
        driver.findElement(LoginBtn);
    }
}
