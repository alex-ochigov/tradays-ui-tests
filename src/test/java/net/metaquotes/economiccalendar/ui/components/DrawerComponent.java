package net.metaquotes.economiccalendar.ui.components;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.metaquotes.economiccalendar.ui.appium.Component;

@AndroidFindBy(id = "drawer")
public class DrawerComponent extends Component {

    @AndroidFindBy(xpath = ".//*[@text='Holidays']")
    public MobileElement holidays;

    @AndroidFindBy(xpath = ".//*[@text='Low']")
    public MobileElement low;

    @AndroidFindBy(xpath = ".//*[@text='Medium']")
    public MobileElement medium;

    @AndroidFindBy(xpath = ".//*[@text='High']")
    public MobileElement high;

    @AndroidFindBy(xpath = ".//*[@text='Events']")
    public MobileElement events;

    protected DrawerComponent(MobileElement element) {
        super(element);
    }
}
