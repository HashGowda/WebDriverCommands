package PumaTest;

import com.aventstack.extentreports.ExtentTest;

public class PumaExtentTestManager {
    private static ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

    public static ExtentTest getExtentTest() {
        return extent.get();
    }

    public static void setExtentTest(ExtentTest test) {
        extent.set(test);
    }

    public static void removeTest() {
        extent.remove();
    }
}
