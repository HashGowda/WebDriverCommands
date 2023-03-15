package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.IInvokedMethod;
import org.testng.ITestResult;

import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class ConfigPage {
    public WebDriver driver;

    public ConfigPage() {
        this.driver = DriverPage.getDriver();
    }

    public void launchApp() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverPage.setDriver(driver);
    }

    public void testResultCapture(ITestResult result) {
        System.out.println("Check Status " + result.getStatus());

        //Success Block
        if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentTestManager.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " is Passed");
        }

        //Failure Block
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Exception is: "+result.getThrowable());
            ExtentTestManager.getExtentTest().getExtent().removeTest(ExtentTestManager.getExtentTest());
        } else {
            StringWriter sw = new StringWriter();
            result.getThrowable().printStackTrace(new PrintWriter(sw));

            String methodClassName = result.getThrowable().getMessage();
            for (StackTraceElement stack : result.getThrowable().getStackTrace()) {
                if (stack.getClassName().contains("Pages.PageActions")) {
                    methodClassName = methodClassName + " Failed in class: " + stack.getClassName() +
                            ", in Method: " + stack.getMethodName() +
                            ", in Line: " + stack.getLineNumber();
                    break;
                }
            }
            ExtentTestManager.getExtentTest().fail(methodClassName);
            ExtentTestManager.getExtentTest().addScreenCaptureFromBase64String(getBase64());
        }
    }

    public String getBase64() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

    public abstract void beforeInvocation(IInvokedMethod method, ITestResult testResult);

    public abstract void afterInvocation(IInvokedMethod method, ITestResult testResult);
}

