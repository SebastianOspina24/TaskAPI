package edu.eci.ieti.service;

import java.util.List;
import edu.eci.ieti.entity.Task;

public interface TaskService {
    Task create(Task user);

    Task findById(String id);

    List<Task> getAll();

    void deleteById(String id);

    Task update(Task user, String userId);
}
