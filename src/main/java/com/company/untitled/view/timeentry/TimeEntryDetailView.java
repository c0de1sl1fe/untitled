package com.company.untitled.view.timeentry;

import com.company.untitled.entity.TimeEntry;

import com.company.untitled.entity.User;
import com.company.untitled.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Route(value = "timeEntries/:id", layout = MainView.class)
@ViewController("TimeEntry.detail")
@ViewDescriptor("time-entry-detail-view.xml")
@EditedEntityContainer("timeEntryDc")
public class TimeEntryDetailView extends StandardDetailView<TimeEntry> {
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<TimeEntry> event) {
        event.getEntity().setEntryDate(timeSource.now().toLocalDate());
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setUser(user);
    }

}