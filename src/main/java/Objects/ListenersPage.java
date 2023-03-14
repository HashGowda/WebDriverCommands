package Objects;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.event.ItemEvent;

public class ListenersPage extends ConfigPage implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtentManager.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtentManager.flushReports();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult result){

    }

    @Override
    public void onTestSuccess(ITestResult result){
        ExtentLogger.pass(result.getMethod().getMethodName()+" is Passed");
    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtentLogger.fail(result.getMethod().getMethodName()+ " is Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result){
        ExtentLogger.skip(result.getMethod().getMethodName()+ " is Skipped");
    }
}
