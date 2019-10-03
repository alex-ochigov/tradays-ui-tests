package net.metaquotes.economiccalendar.ui.screens;

import io.appium.java_client.AppiumDriver;
import net.metaquotes.economiccalendar.ui.appium.Screen;
import net.metaquotes.economiccalendar.ui.components.BottomBarComponent;
import net.metaquotes.economiccalendar.ui.components.DrawerComponent;
import net.metaquotes.economiccalendar.ui.components.EventListItemComponent;
import net.metaquotes.economiccalendar.ui.components.TopBarComponent;
import net.metaquotes.economiccalendar.ui.utils.Callback;

import java.util.List;

public class CalendarScreen extends Screen {
    public TopBarComponent topBar;
    public BottomBarComponent bottomBar;
    public DrawerComponent drawer;
    public List<EventListItemComponent> events;

    public CalendarScreen(AppiumDriver driver) {
        super(driver);
    }

    public EventsFilterScreen openFilterScreen() {
        topBar.filterButton.click();
        return new EventsFilterScreen(super.driver);
    }

    public void openDrawer() {
        topBar.navigateButton.click();
    }

    public void getEvent(int index, Callback<EventListItemComponent> callback) {
        callback.callback(events.get(index));
    }

}
