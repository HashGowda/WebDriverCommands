package Base;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.PrintWriter;
import java.lang.reflect.Method;

@Listeners({ListenersPage.class})
public class BasePage extends ListenersPage {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        ExtentManager.configExtentTest(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        launchApp();
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(Method name) {
        ExtentManager.startTest(name);
    }

    @BeforeMethod
    public void myTest(){
        try {

        } catch (Exception e){
            Assert.fail("Test failed due to exception: "+e.getMessage());
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        Throwable throwable = result.getThrowable();
        if (throwable!=null){
            PrintWriter out = new PrintWriter(System.out);
            throwable.printStackTrace(out);
            out.flush();
        }
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(ITestResult result) {
        testResultCapture(result);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        DriverPage.getDriver().close();
    }
}

