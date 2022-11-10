package io.logic;

import io.model.Task;
import io.model.TaskRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@AllArgsConstructor
@Service
public class TaskService {
    private static final Logger logger = LoggerFactory.getLogger(TaskService.class);
    private final TaskRepository repository;

    @Async
    public CompletableFuture<List<Task>> findAllAsync(){
        logger.info("Suppy async!");
        return CompletableFuture.supplyAsync(repository::findAll);
    }
}
