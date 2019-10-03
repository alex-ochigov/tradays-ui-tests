package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

public class EventHistoryTabItemComponent extends Component {

    @AndroidFindBy(id = "time")
    public MobileElement time;

    @AndroidFindBy(id = "actual")
    public MobileElement actual;

    @AndroidFindBy(id = "forecast")
    public MobileElement forecast;

    @AndroidFindBy(id = "previous")
    public MobileElement previous;

    protected EventHistoryTabItemComponent(MobileElement element) {
        super(element);
    }

    public String log() {
        return new StringBuilder()
            .append(time.getText())
            .append(" | ")
            .append(actual.getText().isEmpty() ? "-" : actual.getText())
            .append(" | ")
            .append(forecast.getText().isEmpty() ? "-" : forecast.getText())
            .append(" | ")
            .append(previous.getText().isEmpty() ? "-" : previous.getText())
            .append(" |")
            .toString();
    }
}
