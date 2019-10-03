package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

public class EventFilterSelectComponent extends Component {

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(id = "select_all")
    public MobileElement selectAllButton;

    protected EventFilterSelectComponent(MobileElement element) {
        super(element);
    }
}
