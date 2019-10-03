package net.metaquotes.economiccalendar.ui;

import io.appium.java_client.AppiumDriver;
import net.metaquotes.economiccalendar.ui.appium.DriverProvider;
import net.metaquotes.economiccalendar.ui.appium.Drivers;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private Map<String, String> params;
    private String udid;
    private final String hub = "http://localhost:4723/wd/hub";
    private final File app = new File("src/test/resources/tradays.apk");

    @BeforeClass
    public void setUp(ITestContext ctx) throws MalformedURLException {
        params = ctx.getCurrentXmlTest().getAllParameters();
        params.put("apk", app.getAbsolutePath());
        udid = params.get("udid");

        AppiumDriver driver = new AppiumDriver(new URL(hub), DriverProvider.setupCapabilities(params));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
