package io.logic;

import io.TaskConfigurationProperties;
import io.model.ProjectRepository;
import io.model.TaskGroupRepository;
import io.model.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogicConfiguration {
    @Bean
    ProjectService projectService(
            final ProjectRepository repository,
            final TaskGroupRepository taskGroupRepository,
            final TaskGroupService taskGroupService,
            final TaskConfigurationProperties config
            ){
        return new ProjectService(repository, taskGroupRepository, taskGroupService, config);
    }
    @Bean
    TaskGroupService taskGroupService(
            final TaskGroupRepository taskGroupRepository,
            final TaskRepository taskRepository
            ){
        return new TaskGroupService(taskGroupRepository, taskRepository);
    }
}
