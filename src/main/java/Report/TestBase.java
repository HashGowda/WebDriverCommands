package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestBase {
    public WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test;
    String htmlReportPath = "ExtentReport/Report.html";

    @BeforeTest
    public void setUp() {
        ExtentSparkReporter spark = new ExtentSparkReporter(htmlReportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Extent Report");
        spark.config().setReportName("Sample Report");

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown()throws Exception{
        driver.close();
        extent.flush();
        Desktop.getDesktop().browse(new File("ExtentReport/Report.html").toURI());
    }

    @Test(priority = 2)
    public void login(ITestResult result) throws IOException {
        try {
            test.log(Status.INFO,"Login test is started");
            driver.findElement(By.name("username")).sendKeys("Admin");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.name("password")).sendKeys("admin123");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+" is passed",ExtentColor.GREEN));
        } catch (Exception e){
            test.log(Status.FAIL, test.addScreenCaptureFromPath(captureScreenshot(driver))+" Login test failed");
        }
    }

    @Test(priority = 1)
    public void validateTitle(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.INFO, (" Title validation is started"));
            String title = driver.getTitle();
            System.out.println("Title is " + title);
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " is passed", ExtentColor.GREEN));
        } else if (result.getStatus()==ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " is failed", ExtentColor.RED));
            test.log(Status.FAIL, test.addScreenCaptureFromPath(captureScreenshot(driver))+result.getName()+" is failed");
            test.fail(result.getThrowable());
        } else if (result.getStatus()==ITestResult.SKIP) {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " is skipped", ExtentColor.BLUE));
        }
    }

    @Test(priority = 3)
    public void testCase(){
        test = extent.createTest("Login Test").assignAuthor("Harish").assignCategory("Functional Test").assignDevice("Chrome");
        test.log(Status.INFO, "Site is opened");
        assertEquals(driver.getTitle(),"OrangeHR");
        test.log(Status.PASS,"Site loaded successfully");
    }

    @Test(priority = 4)
    public void skipTest(){
        test.log(Status.SKIP,"Skip test");
        throw new SkipException("This test is skipped");
    }

    @AfterMethod
    public void getResult(ITestResult result) throws Exception {
        if (result.getStatus()==ITestResult.FAILURE){
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test Case FAILED due to below issues: ", ExtentColor.RED));
            test.log(Status.FAIL, test.addScreenCaptureFromPath(captureScreenshot(driver))+result.getName()+" is failed");
            test.fail(result.getThrowable());
        } else if (result.getStatus()==ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        } else if (result.getStatus()==ITestResult.SKIP) {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test case SKIPPED", ExtentColor.BLUE));
        }
    }


    public String captureScreenshot(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("ExtentReport/Image.png");
        String absolutePath = destFile.getPath();
        FileUtils.copyFile(scrFile, destFile);
        return absolutePath;
    }
}
