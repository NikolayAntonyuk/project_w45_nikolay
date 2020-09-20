package tests.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed" + "\n");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed!" + "\n");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test was skipped!" + "\n");
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}
