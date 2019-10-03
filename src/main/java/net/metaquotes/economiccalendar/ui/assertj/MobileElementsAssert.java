package net.metaquotes.economiccalendar.ui.assertj;

import io.appium.java_client.MobileElement;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Booleans;

import java.util.List;

public class MobileElementsAssert extends AbstractAssert<MobileElementsAssert, List<MobileElement>> {
    private Booleans booleans = Booleans.instance();

    public MobileElementsAssert(List<MobileElement> actual) {
        super(actual, MobileElementsAssert.class);
    }

    public MobileElementsAssert hasSize(int size) {
        booleans.assertEqual(info, actual.size() == size, true);
        return this;
    }

    public MobileElementsAssert sizeGreatThan(int size) {
        booleans.assertEqual(info, actual.size() > size, true);
        return this;
    }
}
