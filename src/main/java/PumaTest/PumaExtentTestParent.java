package PumaTest;

import com.aventstack.extentreports.ExtentTest;

public class PumaExtentTestParent {
    private static ThreadLocal<ExtentTest> extentParent = new ThreadLocal<ExtentTest>();

    public static ExtentTest getExtentTest() {
        return extentParent.get();
    }

    public static void setExtentTest(ExtentTest extentTest) {
        extentParent.set(extentTest);
    }
}
