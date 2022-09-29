package edu.eci.ieti.service.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.ieti.entity.Task;
import edu.eci.ieti.service.TaskService;

public class TaskServiceHashMap implements TaskService {

    private HashMap<String, Task> persistence = new HashMap<>();

    @Override
    public Task create(Task task) {
        if (persistence.get(task.getId()) == null)
            persistence.put(task.getId(), task);
        return persistence.get(task.getId());
    }

    @Override
    public Task findById(String id) {
        return persistence.get(id);
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<Task>(persistence.values());
    }

    @Override
    public boolean deleteById(String id) {
        persistence.remove(id);
        return true;
    }

    @Override
    public Task update(Task task, String userId) {
        if (task.getId() != userId)
            persistence.remove(userId);
        persistence.put(task.getId(), task);
        return persistence.get(task.getId());
    }

}
