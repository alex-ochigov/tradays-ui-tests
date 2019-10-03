package net.metaquotes.economiccalendar.ui.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static java.time.Duration.ofSeconds;

public class Screen {
    public AppiumDriver driver;

    public Screen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(15)), this);
    }

    public MobileElement scrollToElementWithText(String text) {
        return (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ text +"\"));"));
    }
}
