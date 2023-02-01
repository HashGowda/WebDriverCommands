package TestCases;

import Pages.DashBoard;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTC1 {

    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        DashBoard dashBoard = new DashBoard(driver);

        home.clickLogin();

        login.enterUserName("Test User");
        login.enterPassword("welcom@123");

        login.clickLogin();
        Thread.sleep(2000);

        System.out.println("The page heading is "+dashBoard.getHeading());
        dashBoard.clickLogout();

        driver.quit();
    }
}
