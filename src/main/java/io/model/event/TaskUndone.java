package io.model.event;

import io.model.Task;

import java.time.Clock;

public class TaskUndone extends TaskEvent {
    TaskUndone(final Task source) {
        super(source.getId(), Clock.systemDefaultZone());
    }
}
