package com.company.untitled.view.timeentry;

import com.company.untitled.entity.TimeEntry;

import com.company.untitled.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

import java.time.LocalDate;

@Route(value = "timeEntries/:id", layout = MainView.class)
@ViewController("TimeEntry.detail")
@ViewDescriptor("time-entry-detail-view.xml")
@EditedEntityContainer("timeEntryDc")
public class TimeEntryDetailView extends StandardDetailView<TimeEntry> {
    @Subscribe
    public void onInitEntity(final InitEntityEvent<TimeEntry> event) {
        event.getEntity().setEntryDate(LocalDate.now());
    }
}