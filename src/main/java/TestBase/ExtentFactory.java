package TestBase;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {

    private ExtentFactory(){

    }

    private static ExtentFactory inst = new ExtentFactory();

    public static ExtentFactory getInstance(){
        return inst;
    }

    //Factory design patter --> define separate factory methods for creating objects and create objects by calling that methods
    ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

    public ExtentTest getExtent(){
        return extent.get();
    }

    public void setExtent(ExtentTest extentTestObject){
        extent.set(extentTestObject);
    }

    public void removeExtentObject(){
        extent.remove();
    }
}
