package net.metaquotes.economiccalendar.ui.utils;

import io.qameta.allure.Attachment;

public class AllureHelpers {

    @Attachment(value = "{0}", type = "text/plain")
    public static String sendLog(String message) {
        return message;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] sendScreenshot(byte[] screenshot) {
        return screenshot;
    }
}
