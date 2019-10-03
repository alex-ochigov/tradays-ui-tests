package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;


@AndroidFindBy(id = "settings_list")
@AndroidFindBy(xpath = ".//*[@resource-id='net.metaquotes.economiccalendar:id/title']/../..")
public class EventFilterListItemComponent extends Component {

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(id = "check")
    public MobileElement checkbox;

    @AndroidFindBy(id = "select_all")
    public MobileElement selectAllButton;

    protected EventFilterListItemComponent(MobileElement element) {
        super(element);
    }
}
