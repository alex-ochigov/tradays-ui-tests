package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

@AndroidFindBy(id = "main_toolbar")
public class TopBarComponent extends Component {

    @AndroidFindBy(className = "android.widget.ImageButton")
    public MobileElement navigateButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public MobileElement title;

    @AndroidFindBy(id = "menu_alert")
    public MobileElement alertButton;

    @AndroidFindBy(id = "menu_share")
    public MobileElement shareButton;

    @AndroidFindBy(id = "menu_filter")
    public MobileElement filterButton;

    protected TopBarComponent(MobileElement element) {
        super(element);
    }
}
