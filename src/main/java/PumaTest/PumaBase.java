package PumaTest;

import Base.DriverPage;
import Base.ExtentManager;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

@Listeners({PumaListeners.class})
public class PumaBase extends PumaListeners {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        PumaExtentManager.configExtentTest(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
        appLaunch();
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(Method name) {
        PumaExtentManager.startTest(name);
    }

    @BeforeMethod
    public void beforeMethod(){
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
    public void afterTest(ITestResult result) throws IOException {
        testResultCapture(result);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        PumaDriver.getDriver().close();
    }
}
