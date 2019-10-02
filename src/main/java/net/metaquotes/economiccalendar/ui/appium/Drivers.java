package net.metaquotes.economiccalendar.ui.appium;

import io.appium.java_client.AppiumDriver;

import java.util.HashMap;

public class Drivers {
    private final static HashMap<String, AppiumDriver> drivers = new HashMap();

    public static AppiumDriver get(String udid) {
        return drivers.get(udid);
    }

    public static void set(String uuid, AppiumDriver driver) {
        drivers.put(uuid, driver);
    }
}
