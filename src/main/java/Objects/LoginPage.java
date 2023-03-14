package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//button[normalize-space()='Login']");
    By myInfo = By.xpath("//span[normalize-space()='My Info']");

    public void sendData(String usrName, String pswrd){
        try {
            driver.findElement(userName).sendKeys(usrName);
            Thread.sleep(2000);
            driver.findElement(password).sendKeys(pswrd);
            Thread.sleep(2000);
            driver.findElement(loginBtn).click();
            Thread.sleep(2000);
            driver.findElement(myInfo).click();
            Thread.sleep(2000);
        } catch (Exception e){
            System.out.println("Exceptions Caught "+e.getMessage());
        }

    }
}
