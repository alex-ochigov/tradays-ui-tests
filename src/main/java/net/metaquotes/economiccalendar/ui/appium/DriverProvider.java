package net.metaquotes.economiccalendar.ui.appium;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class DriverProvider {
    public static DesiredCapabilities setupCapabilities(Map<String, String> params) {
        DesiredCapabilities caps = new DesiredCapabilities();
        String platform = params.get("platform");
        
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, params.get("automation"));
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, params.get("version"));
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.get("name"));
        caps.setCapability(MobileCapabilityType.UDID, params.get("udid"));
        caps.setCapability(MobileCapabilityType.FULL_RESET, false);
        caps.setCapability(MobileCapabilityType.NO_RESET, false);

        if (platform.equals("android")) {
            caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
            caps.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
            caps.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, true);
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, params.get("appPackage"));
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, params.get("appActivity"));
            caps.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, Integer.parseInt(params.get("port")));
        } else {
            caps.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, false);
            caps.setCapability(IOSMobileCapabilityType.WDA_LOCAL_PORT, Integer.parseInt(params.get("port")));
            caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, params.get("bundleId"));
            // For real device testing
            // caps.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, params.get("teamId"));
            // caps.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "iPhone Developer");
        }

        return caps;
    }
}
