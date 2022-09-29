package edu.eci.ieti.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import edu.eci.ieti.entity.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

}
