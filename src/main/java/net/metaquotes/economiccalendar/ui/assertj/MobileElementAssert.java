package net.metaquotes.economiccalendar.ui.assertj;

import io.appium.java_client.MobileElement;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Booleans;
import org.assertj.core.internal.Strings;

import static net.metaquotes.economiccalendar.ui.utils.AllureHelpers.sendLog;

public class MobileElementAssert extends AbstractAssert<MobileElementAssert, MobileElement> {
    private Booleans booleans = Booleans.instance();
    private Strings strings = Strings.instance();

    public MobileElementAssert(MobileElement actual) {
        super(actual, MobileElementAssert.class);
    }

    public MobileElementAssert isDisplayed() {
        booleans.assertEqual(info, actual.isDisplayed(), true);
        sendLog("[Assert] Element: " + actual + " is displayed");
        return this;
    }

    public MobileElementAssert hasText(String text) {
        strings.assertEqualsIgnoringCase(info, actual.getText(), text);
        sendLog("[Assert] Element: " + actual + " has text - " + text);
        return this;
    }

    public MobileElementAssert containsText(String text) {
        strings.assertContainsIgnoringCase(info, actual.getText(), text);
        sendLog("[Assert] Element: " + actual + " contains text - " + text);
        return this;
    }

    public MobileElementAssert hasChecked(String text) {
        strings.assertEqualsIgnoringCase(info, actual.getAttribute("checked"), text);
        sendLog("[Assert] Element: " + actual + " attribute 'checked' is " + text);
        return this;
    }
}
