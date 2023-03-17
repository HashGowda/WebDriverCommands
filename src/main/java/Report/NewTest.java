package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class NewTest {
    public WebDriver driver;
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/NewReport.html");


    @Test
    public void launchApp() {
        ExtentTest test = extent.createTest("Launch Browser and Website").assignAuthor("Harish").assignCategory("Sanity Test").assignDevice("Chrome");
        test.log(Status.PASS, "User launched website");
        test.pass("User launched website verified");
    }

    @Test
    public void verifyLogin() {
        ExtentTest test = extent.createTest("Verify Login").assignAuthor("Harish").assignCategory("Smoke Test").assignDevice("Chrome");
        test.info("Login page is displayed");
        test.pass("Logged into application");
        test.warning("Reset password alert displaying");
    }

    @Test
    public void verifyMyInfo() {
        ExtentTest test = extent.createTest("Verify My Info").assignAuthor("Harish").assignCategory("Regression Test").assignDevice("Chrome");
        test.skip("Verify my info skipped");
    }

    @Test
    public void verifyContactDetails() {
        ExtentTest test = extent.createTest("Verify Contact Details").assignAuthor("Harish").assignCategory("Sanity Test").assignDevice("Chrome");
        test.fail("Unable to load contact details");
    }

    @Test
    public void verifyLogout() {
        ExtentTest test = extent.createTest("Verify Logout").assignAuthor("Harish").assignCategory("Smoke Test").assignDevice("Chrome");
        test.pass("User logged out from application");
        test.info("User redirected to login page");
    }


    @BeforeTest
    public void beforeTest() {
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Testing Report");
    }

    @AfterTest
    public void afterTest() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File("ExtentReport/NewReport.html").toURI());
    }
}
