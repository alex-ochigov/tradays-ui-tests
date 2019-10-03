package net.metaquotes.economiccalendar.ui.listeners;

import io.appium.java_client.events.api.general.ElementEventListener;
import io.appium.java_client.events.api.general.SearchingEventListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.metaquotes.economiccalendar.ui.utils.AllureHelpers.sendLog;

public class EventsListener implements ElementEventListener, SearchingEventListener {

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {}

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        // sendLog("[FIND] The element was found using " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {}

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {}

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {}

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {}

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver) {}

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {}

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {}

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {}
}

