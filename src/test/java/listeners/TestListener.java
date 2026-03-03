package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;
import base.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object currentClass = result.getInstance();
        BaseTest baseTest = (BaseTest) currentClass;

        ScreenshotUtil.captureScreenshot(
                baseTest.driver,
                result.getName()
        );
    }
}