package net.metaquotes.economiccalendar.ui.appium;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static java.time.Duration.ofSeconds;

public class Screen {
    public Screen(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(5)), this);
    }
}
