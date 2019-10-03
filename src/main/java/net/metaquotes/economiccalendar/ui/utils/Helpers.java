package net.metaquotes.economiccalendar.ui.utils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class Helpers {

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public static File takeScreenshotAsFile(AppiumDriver driver) {
        String path = System.getProperty("user.dir") + "build/reports/tests/screen_" + System.currentTimeMillis() + ".png";
        File screenshot = driver.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(path));
            System.out.println("file://" + path);
        } catch (IOException e) {
            System.out.print(e);
        }

        return screenshot;
    }

}
