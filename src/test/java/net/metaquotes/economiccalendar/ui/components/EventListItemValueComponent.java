package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

public class EventListItemValueComponent extends Component {

    @AndroidFindBy(id = "title")
    public MobileElement title;

    @AndroidFindBy(id = "value_num")
    public MobileElement value;

    protected EventListItemValueComponent(MobileElement element) {
        super(element);
    }
}
