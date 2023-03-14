package TestScenarios;

import Objects.LoginPage;
import Objects.MyInfoPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestMethods {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendData("Admin","admin123");
    }

    @Test
    public void myInfoTab(){
        MyInfoPage myInfo = new MyInfoPage(driver);
        myInfo.addData("Paul","0024","");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
