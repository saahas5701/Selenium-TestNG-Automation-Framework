package listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import factory.DriverFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    private static ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = ExtentManager.getInstance()
                .createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.log(Status.FAIL, "Test Failed");
        test.log(Status.FAIL, result.getThrowable());

        String screenshotPath =
                ScreenshotUtil.captureScreenshot(
                        DriverFactory.getDriver(),
                        result.getMethod().getMethodName()
                );

        try {
            test.addScreenCaptureFromPath(screenshotPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.getInstance().flush();
    }
}