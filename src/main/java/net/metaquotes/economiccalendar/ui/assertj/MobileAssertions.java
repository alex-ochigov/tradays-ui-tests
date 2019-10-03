package net.metaquotes.economiccalendar.ui.assertj;

import io.appium.java_client.MobileElement;

import java.util.List;

public class MobileAssertions {

    public static MobileElementAssert assertThat(MobileElement actual) {
        return new MobileElementAssert(actual);
    }

    public static MobileElementsAssert assertThat(List<MobileElement> actual) {
        return new MobileElementsAssert(actual);
    }

}
