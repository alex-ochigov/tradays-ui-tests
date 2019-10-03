package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

@AndroidFindBy(id = "events_list")
@AndroidFindBy(xpath = ".//*[@resource-id='net.metaquotes.economiccalendar:id/importance_hint']/..")
public class EventListItemComponent extends Component {

    @AndroidFindBy(id = "importance_hint")
    public MobileElement hint;

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(id = "time")
    public MobileElement time;

    @AndroidFindBy(id = "actual")
    public EventListItemValueComponent actual;

    @AndroidFindBy(id = "forecast")
    public EventListItemValueComponent forecast;

    @AndroidFindBy(id = "previous")
    public EventListItemValueComponent previous;

    protected EventListItemComponent(MobileElement element) {
        super(element);
    }
}
