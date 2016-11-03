package classes.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.Date;

/**
 * Created by Витал on 01.11.2016.
 */


public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("</br>"  + "Test passed: " +(new Date(System.currentTimeMillis()))+ "["+ iTestResult.getTestContext().getName()+ "]"
                +
                "[" + iTestResult.getTestClass().getName() + "]" +
                "[" + iTestResult.getMethod().getMethodName() + "]. " +
                "Status <" + iTestResult.getStatus()+ ">. " +
                "Time duration <" + (iTestResult.getEndMillis() - iTestResult.getStartMillis()) + ">." );
    }
    @Override
    public void onTestFailure(ITestResult iTestResult) {
            Reporter.log("</br>"  + "Test Failure: " +(new Date(System.currentTimeMillis()))+ "["+ iTestResult.getTestContext().getName()+ "]"
                    +
                    "[" + iTestResult.getTestClass().getName() + "]" +
                    "[" + iTestResult.getMethod().getMethodName() + "]. " +
                    "Status <" + iTestResult.getStatus()+ ">. " +
                    "Time duration <" + (iTestResult.getEndMillis() - iTestResult.getStartMillis()) + ">." );
        }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }


    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
