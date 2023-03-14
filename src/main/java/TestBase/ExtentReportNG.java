package TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportNG {

    static ExtentReports extent;

    public static ExtentReports setUpExtentReport(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        Date date = new Date();
        String actualDate= format.format(date);

        String reportPath = System.getProperty("ExtentReports/Report.html");
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Automation Testing Report");
        spark.config().setReportName("Testing Report");

        ExtentTest test = extent.createTest("Test 1").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Chrome");

        return extent;
    }
}
