package net.metaquotes.economiccalendar.ui;

import io.appium.java_client.AppiumDriver;
import net.metaquotes.economiccalendar.ui.appium.DriverProvider;
import net.metaquotes.economiccalendar.ui.appium.Drivers;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class BaseTest {

    private Map<String, String> params;
    private String udid;
    private final String hub = "http://localhost:4723/wd/hub";

    @BeforeClass
    public void setUp(ITestContext ctx) throws MalformedURLException {
        params = ctx.getCurrentXmlTest().getAllParameters();
        udid = params.get("udid");

        AppiumDriver driver = new AppiumDriver(new URL(hub), DriverProvider.setupCapabilities(params));
        Drivers.set(udid, driver);
    }

    @AfterClass
    public void tearDown() {
        getDriver().quit();
    }

    public AppiumDriver getDriver() {
        return Drivers.get(udid);
    }
}
