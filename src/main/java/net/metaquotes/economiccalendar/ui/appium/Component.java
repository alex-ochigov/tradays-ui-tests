package net.metaquotes.economiccalendar.ui.appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.Widget;
import org.openqa.selenium.support.PageFactory;

import static java.time.Duration.ofSeconds;

public class Component extends Widget {

    protected Component(MobileElement element) {
        super(element);
        PageFactory.initElements(new AppiumFieldDecorator(element, ofSeconds(15)), this);
    }

    public void select() {
        this.getWrappedElement().click();
    }

    public MobileElement findElementByText(String text) {
        return (MobileElement) this.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ text +"\"));"));
    }
}
