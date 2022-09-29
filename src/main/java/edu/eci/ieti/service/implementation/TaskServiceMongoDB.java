package edu.eci.ieti.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.ieti.entity.Task;
import edu.eci.ieti.repository.TaskRepository;
import edu.eci.ieti.service.TaskService;

@Service
public class TaskServiceMongoDB implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceMongoDB(@Autowired TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task task) {
        return taskRepository.insert(task);
    }

    @Override
    public Task findById(String id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        boolean flag = taskRepository.findById(id).isPresent();
        if (flag)
            taskRepository.deleteById(id);
        flag = taskRepository.findById(id).isEmpty();
        return flag;

    }

    @Override
    public Task update(Task task, String taskid) {
        return taskRepository.save(task);
    }

}
