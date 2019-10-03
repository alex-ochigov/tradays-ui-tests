package net.metaquotes.economiccalendar.ui.assertj;

import io.appium.java_client.MobileElement;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Booleans;
import org.assertj.core.internal.Strings;

public class MobileElementAssert extends AbstractAssert<MobileElementAssert, MobileElement> {
    private Booleans booleans = Booleans.instance();
    private Strings strings = Strings.instance();

    public MobileElementAssert(MobileElement actual) {
        super(actual, MobileElementAssert.class);
    }

    public MobileElementAssert isDisplayed() {
        booleans.assertEqual(info, actual.isDisplayed(), true);
        return this;
    }

    public MobileElementAssert hasText(String text) {
        strings.assertEqualsIgnoringCase(info, actual.getText(), text);
        return this;
    }

    public MobileElementAssert containsText(String text) {
        strings.assertContainsIgnoringCase(info, actual.getText(), text);
        return this;
    }

    public MobileElementAssert hasChecked(String text) {
        strings.assertEqualsIgnoringCase(info, actual.getAttribute("checked"), text);
        return this;
    }
}
