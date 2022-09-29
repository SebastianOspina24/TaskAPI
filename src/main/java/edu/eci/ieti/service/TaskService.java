package edu.eci.ieti.service;

import java.util.List;
import edu.eci.ieti.entity.Task;

public interface TaskService {
    Task create(Task task);

    Task findById(String id);

    List<Task> getAll();

    boolean deleteById(String id);

    Task update(Task task, String taskid);
}
