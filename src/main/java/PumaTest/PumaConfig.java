package PumaTest;

import Base.DriverPage;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.IInvokedMethod;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class PumaConfig {

    public WebDriver driver;

    public PumaConfig() {
        this.driver = PumaDriver.getDriver();
    }

    public void appLaunch() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/in/en");
        DriverPage.setDriver(driver);
    }

    public void testResultCapture(ITestResult result) throws IOException {
        System.out.println("Check Status " + result.getStatus());

        //Success Block
        if (result.getStatus() == ITestResult.SUCCESS) {
            PumaExtentTestManager.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " is Passed");
        }

        //Failure Block
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Exception is: "+result.getThrowable());
            PumaExtentTestManager.getExtentTest().getExtent().removeTest(PumaExtentTestManager.getExtentTest());
            PumaExtentTestManager.getExtentTest().log(Status.FAIL, result.getMethod().getMethodName()+" is Failed");
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
            PumaExtentTestManager.getExtentTest().fail(methodClassName);
            PumaExtentTestManager.getExtentTest().addScreenCaptureFromPath(captureScreenshot(driver));
        }
    }

    public String captureScreenshot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile= new File("ExtentReport/Image2.png");
        String absolutePath = destFile.getPath();
        FileUtils.copyFile(scrFile, destFile);
        return absolutePath;
    }


    public abstract void beforeInvocation(IInvokedMethod method, ITestResult testResult);

    public abstract void afterInvocation(IInvokedMethod method, ITestResult testResult);
}
