package Objects;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.event.ItemEvent;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public abstract class ConfigPage {
    public WebDriver driver;

    public ConfigPage(WebDriver driver) {
        this.driver = DriverPage.getDriver();
    }

    public void launchApp() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = WebDriverManager.chromedriver().create();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get("https://in.puma.com/in/en");
        DriverManager.setDriver(driver);
    }

    public void testResultCapture(ITestResult result) {
        System.out.println("Check Status " + result.getStatus());

        //Success Block
        if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentTestManager.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " Passed");
        }

        //Failure Block
        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getExtentTest().getExtent().removeTest(ExtentTestManager.getExtentTest());
        } else {
            StringWriter exceptionInfo = new StringWriter();
            result.getThrowable().printStackTrace(new PrintWriter(exceptionInfo));

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
}

//    @Test
//    public void login() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.sendData("Admin", "admin123");
//    }
//
//    @Test
//    public void myInfoTab() {
//        MyInfoPage myInfo = new MyInfoPage(driver);
//        myInfo.addData("Paul", "0024", "");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        driver.quit();
//    }
//}
