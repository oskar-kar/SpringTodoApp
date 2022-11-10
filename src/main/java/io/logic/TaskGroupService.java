package io.logic;

import io.model.Project;
import io.model.TaskGroup;
import io.model.TaskGroupRepository;
import io.model.TaskRepository;
import io.model.projection.GroupReadModel;
import io.model.projection.GroupWriteModel;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
//@Service
public class TaskGroupService {
    private TaskGroupRepository repository;
    private TaskRepository taskRepository;

    public GroupReadModel createGroup(GroupWriteModel source){
        return createGroup(source, null);
    }

    public GroupReadModel createGroup(final GroupWriteModel source, final Project project){
        TaskGroup result = repository.save(source.toGroup(project));
        return new GroupReadModel(result);
    }

    public List<GroupReadModel> readAll() {
        return repository.findAll()
                .stream()
                .map(GroupReadModel::new)
                .collect(Collectors.toList());
    }

    public void toggleGroup(int groupId) {
        if (taskRepository.existsByDoneIsFalseAndGroup_Id(groupId))
        {
            throw new IllegalStateException("Group has undone tasks. Do all the tasks first");
        }
        TaskGroup result = repository.findById(groupId)
                .orElseThrow(() -> new IllegalArgumentException("TaskGroup with given id not found"));
        result.setDone(!result.isDone());
        repository.save(result);
    }
}
