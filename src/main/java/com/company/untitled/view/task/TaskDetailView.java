package com.company.untitled.view.task;


import com.company.untitled.entity.Task;
import com.company.untitled.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController("Task_.detail")
@ViewDescriptor("task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {
}