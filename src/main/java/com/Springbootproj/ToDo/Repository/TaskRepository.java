package com.Springbootproj.ToDo.Repository;

import com.Springbootproj.ToDo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long> {

}
