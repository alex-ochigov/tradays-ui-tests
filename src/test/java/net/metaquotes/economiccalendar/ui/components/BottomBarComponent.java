package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

@AndroidFindBy(id = "bottom_bar")
public class BottomBarComponent extends Component {

    @AndroidFindBy(id = "bottom_bar_calendar")
    public MobileElement calendar;

    @AndroidFindBy(id = "bottom_bar_alerts")
    public MobileElement alerts;

    @AndroidFindBy(id = "bottom_bar_trade")
    public MobileElement trade;

    @AndroidFindBy(id = "bottom_bar_settings")
    public MobileElement settings;

    protected BottomBarComponent(MobileElement element) {
        super(element);
    }
}
