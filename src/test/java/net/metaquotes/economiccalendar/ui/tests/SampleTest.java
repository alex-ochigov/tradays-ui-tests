package net.metaquotes.economiccalendar.ui.tests;

import io.qameta.allure.*;
import net.metaquotes.economiccalendar.ui.BaseTest;
import net.metaquotes.economiccalendar.ui.screens.CalendarScreen;
import net.metaquotes.economiccalendar.ui.screens.EventDetailsScreen;
import net.metaquotes.economiccalendar.ui.screens.EventsFilterScreen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static net.metaquotes.economiccalendar.ui.assertj.MobileAssertions.assertThat;
import static net.metaquotes.economiccalendar.ui.utils.AllureHelpers.sendLog;

@Epic("Sample")
@Feature("Test")
@Severity(SeverityLevel.BLOCKER)
public class SampleTest extends BaseTest {

    private CalendarScreen calendarScreen;
    private EventsFilterScreen eventsFilterScreen;
    private EventDetailsScreen eventDetailsScreen;

    @BeforeClass
    public void beforeClass() {
        calendarScreen = new CalendarScreen(super.getDriver());
    }

    @Test
    @Description("Test Description: Filter events by priority and country, view event history")
    public void filterEventsByPriorityAndCountry() {
        assertThat(calendarScreen.topBar.title).hasText("Tradays");
        eventsFilterScreen = calendarScreen.openFilterScreen();
        assertThat(eventsFilterScreen.topBar.title).hasText("Filters");
        eventsFilterScreen.findFilter("High", filter -> {
            assertThat(filter.title).hasText("High");
            assertThat(filter.checkbox).hasChecked("true");
        });
        eventsFilterScreen.priorityFilter.selectAllButton.click();
        eventsFilterScreen.findFilter("High", filter -> {
            assertThat(filter.title).hasText("High");
            assertThat(filter.checkbox).hasChecked("false");
        });
        eventsFilterScreen.findFilter("Medium", filter -> {
            assertThat(filter.title).hasText("Medium");
            assertThat(filter.checkbox).hasChecked("false");
            filter.select();
            assertThat(filter.checkbox).hasChecked("true");
        });
        eventsFilterScreen.findFilter("China", filter -> {
            assertThat(filter.title).hasText("China");
            assertThat(filter.checkbox).hasChecked("true");
        });
        eventsFilterScreen.countryFilter.selectAllButton.click();
        eventsFilterScreen.findFilter("China", filter -> {
            assertThat(filter.title).hasText("China");
            assertThat(filter.checkbox).hasChecked("false");
        });
        eventsFilterScreen.scrollToElementWithText("Switzerland");
        eventsFilterScreen.findFilter("Switzerland", filter -> {
            assertThat(filter.title).hasText("Switzerland");
            assertThat(filter.checkbox).hasChecked("false");
            filter.select();
            assertThat(filter.checkbox).hasChecked("true");
        });
        eventsFilterScreen.topBar.navigateButton.click();

        assertThat(calendarScreen.topBar.title).hasText("October 2019");
        calendarScreen.openDrawer();
        assertThat(calendarScreen.drawer.holidays).hasChecked("false");
        assertThat(calendarScreen.drawer.low).hasChecked("false");
        assertThat(calendarScreen.drawer.medium).hasChecked("true");
        assertThat(calendarScreen.drawer.high).hasChecked("false");
        calendarScreen.drawer.events.click();
        calendarScreen.getEvent(0, event -> event.select());
        eventDetailsScreen = new EventDetailsScreen(super.getDriver());
        assertThat(eventDetailsScreen.topBar.title).containsText("2019");
        assertThat(eventDetailsScreen.title).containsText("Switzerland");
        assertThat(eventDetailsScreen.country).hasText("Switzerland");
        assertThat(eventDetailsScreen.priority).hasText("MEDIUM");
        eventDetailsScreen.historyTabButton.click();
        sendLog(eventDetailsScreen.historyTab.header.log());
        eventDetailsScreen.historyTab.data.forEach(item -> {
            sendLog(item.log());
        });
    }

    @Test
    public void xfailTest() {
        assertThat(calendarScreen.topBar.title).hasText("Fail");
    }
}
