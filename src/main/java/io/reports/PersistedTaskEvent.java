package io.reports;

import io.model.event.TaskEvent;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Table(name = "task_events")
public class PersistedTaskEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int taskId;
    String name;
    LocalDateTime occurence;

    public PersistedTaskEvent() {
    }

    public PersistedTaskEvent(TaskEvent source) {
        taskId = source.getTaskId();
        name = source.getClass().getSimpleName();
        occurence = LocalDateTime.ofInstant(source.getOccurrence(), ZoneId.systemDefault());
    }
}
