package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

import java.util.List;

@AndroidFindBy(id = "history_table")
public class EventHistoryTabComponent extends Component {

    @AndroidFindBy(id = "head")
    public EventHistoryTabItemComponent header;

    @AndroidFindBy(id = "content")
    @AndroidFindBy(xpath = "//*[@resource-id='net.metaquotes.economiccalendar:id/time']/../..")
    public List<EventHistoryTabItemComponent> data;

    protected EventHistoryTabComponent(MobileElement element) {
        super(element);
    }
}
