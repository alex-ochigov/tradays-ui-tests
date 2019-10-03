package net.metaquotes.economiccalendar.ui.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Screen;
import net.metaquotes.economiccalendar.ui.components.EventFilterListItemComponent;
import net.metaquotes.economiccalendar.ui.components.EventFilterSelectComponent;
import net.metaquotes.economiccalendar.ui.components.TopBarComponent;
import net.metaquotes.economiccalendar.ui.utils.Callback;

import java.util.List;

public class EventsFilterScreen extends Screen {

    public TopBarComponent topBar;

    public List<EventFilterListItemComponent> filters;

    @AndroidFindBy(xpath = "//*[@text='IMPORTANCE']/..")
    public EventFilterSelectComponent priorityFilter;

    @AndroidFindBy(xpath = "//*[@text='COUNTRY']/..")
    public EventFilterSelectComponent countryFilter;

    public EventsFilterScreen(AppiumDriver driver) {
        super(driver);
    }

    public void findFilter(String text, Callback<EventFilterListItemComponent> callback) {
        filters.forEach(filter -> {
            if (filter.title.getText().equals(text)) {
                callback.callback(filter);
            }
        });
    }

    public void getFilter(int index, Callback<EventFilterListItemComponent> callback) {
        callback.callback(filters.get(index));
    }
}
