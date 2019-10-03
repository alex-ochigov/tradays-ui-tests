package net.metaquotes.economiccalendar.ui.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Screen;
import net.metaquotes.economiccalendar.ui.components.EventHistoryTabComponent;
import net.metaquotes.economiccalendar.ui.components.TopBarComponent;

public class EventDetailsScreen extends Screen {

    public TopBarComponent topBar;

    public EventHistoryTabComponent historyTab;

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(id = "country_name")
    public MobileElement country;

    @AndroidFindBy(id = "event_source")
    public MobileElement source;

    @AndroidFindBy(id = "event_sector")
    public MobileElement sector;

    @AndroidFindBy(id = "event_importance")
    public MobileElement priority;

    @AndroidFindBy(id = "time")
    public MobileElement time;

    @AndroidFindBy(id = "actual")
    public MobileElement actual;

    @AndroidFindBy(id = "forecast")
    public MobileElement forecast;

    @AndroidFindBy(id = "previous")
    public MobileElement previous;

    @AndroidFindBy(id = "next_time")
    public MobileElement nextTime;

    @AndroidFindBy(id = "next_actual")
    public MobileElement nextActual;

    @AndroidFindBy(id = "next_forecast")
    public MobileElement nextForecast;

    @AndroidFindBy(id = "next_previous")
    public MobileElement nextPrevious;

    @AndroidFindBy(id = "tab_overview")
    public MobileElement overviewTabButton;

    @AndroidFindBy(id = "tab_chart")
    public MobileElement chartTabButton;

    @AndroidFindBy(id = "tab_history")
    public MobileElement historyTabButton;

    public EventDetailsScreen(AppiumDriver driver) {
        super(driver);
    }
}
