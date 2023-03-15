package Base;

import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@Listeners({ListenersPage.class})
public class BasePage extends ListenersPage {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        ExtentManager.configExtentTest(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        launchApp();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(Method name) {
        ExtentManager.startTest(name);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) {
        testResultCapture(result);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        DriverPage.getDriver().close();
    }
}

