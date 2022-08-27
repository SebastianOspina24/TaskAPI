package edu.eci.ieti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.eci.ieti.dto.TaskDto;
import edu.eci.ieti.entity.Task;
import edu.eci.ieti.service.TaskService;

@RestController
@RequestMapping("/api/v2/tasks")
public class TaskController {

    @Autowired
    private TaskService customerService;

    @GetMapping
    public ResponseEntity<List<TaskDto>> getAll() {
        ArrayList<TaskDto> tasks = new ArrayList<>();
        customerService.getAll().forEach((user) -> tasks.add(user.toTaskDTO()));
        return ResponseEntity.ok(tasks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> findById(@PathVariable String id) {
        Task task = customerService.findById(id);
        return ResponseEntity
                .ok((task != null) ? task.toTaskDTO() : null);
    }

    @PostMapping
    public ResponseEntity<TaskDto> create(@RequestBody TaskDto task) {
        if (task != null)
            return ResponseEntity.ok(customerService.create(task.toTask()).toTaskDTO());
        else
            return ResponseEntity.badRequest().body(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskDto> update(@RequestBody TaskDto task, @PathVariable String id) {
        if (task != null)
            return ResponseEntity.ok(customerService.update(task.toTask(), id).toTaskDTO());
        else
            return ResponseEntity.badRequest().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        boolean flag = customerService.findById(id) != null;
        if (flag)
            customerService.deleteById(id);
        return ResponseEntity.ok(flag);
    }
}
