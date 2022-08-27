package edu.eci.ieti.entity;

import edu.eci.ieti.dto.TaskDto;
import edu.eci.ieti.enums.Status;

public class Task {
    private String id;
    private String name;
    private Status status;
    private String description;
    private String assignedTo;
    private String dueDate;
    private String createdAt;

    public Task() {

    }

    public Task(String id, String name, Status status, String description, String assignedTo, String dueDate,
            String createdAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.description = description;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TaskDto toTaskDTO() {
        return new TaskDto(id, name, status, description, assignedTo, dueDate, createdAt);
    }

}
