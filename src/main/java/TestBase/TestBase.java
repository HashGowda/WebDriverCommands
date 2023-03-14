package TestBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ReusableComponents.ActionEngine;

import java.util.concurrent.TimeUnit;

public class TestBase extends ActionEngine {
    BrowserFactory bf = new BrowserFactory();

    @BeforeMethod
    public void launchApplication(){
        DriverFactory.getInstance().setDriver(bf.createBrowserInstance("Chrome"));
        WebDriver driver = DriverFactory.getInstance().getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.getInstance().closeBrowser();
    }
}
