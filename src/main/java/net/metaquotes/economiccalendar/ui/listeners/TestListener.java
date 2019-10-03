package net.metaquotes.economiccalendar.ui.listeners;

import io.appium.java_client.AppiumDriver;
import net.metaquotes.economiccalendar.ui.appium.Drivers;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import static net.metaquotes.economiccalendar.ui.utils.AllureHelpers.sendScreenshot;
import static net.metaquotes.economiccalendar.ui.utils.Helpers.takeScreenshotAsFile;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        String udid = result.getTestContext().getCurrentXmlTest().getParameter("udid");
        AppiumDriver driver = Drivers.get(udid);

        sendScreenshot(driver.getScreenshotAs(OutputType.BYTES));
        takeScreenshotAsFile(driver);
    }
}
