package Objects;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.sql.DriverManager;

@Listeners({ListenersPage.class})
public class BasePage extends ListenersPage {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        ExtentManager.configExtentTest(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        launchApp();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        DriverManager.getDriver().close();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method name) {
        ExtentManager.startTest(name);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) {
        testResultCapture(result);
    }
}
