package com.Springbootproj.ToDo.controller;


import com.Springbootproj.ToDo.Repository.TaskRepository;
import com.Springbootproj.ToDo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;
    @GetMapping("/hello-world")
    public String helloworld()
    {

        return "hello world from vishnu....";
    }

//    @PostMapping("/api/tasks")
//    public List<String> createTask()
//    {
//        List<String> users = new ArrayList<>();
//        users.add("VISHNU");
//        users.add("deena");
//        users.add("Ameen");
//        return users;
//    }

    @PostMapping
    public Task createTask(@RequestBody Task task)
    {
        System.out.println(task.getDescription() + " - " + task.isCompleted());
        taskRepository.save(task);
        System.out.println(task.getDescription() + " - " + task.isCompleted());
        return task;

    }
    @GetMapping
    public List<Task> getAllTasks()
    {
        return taskRepository.findAll();
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task)
    {
        task.setId(id);
        return taskRepository.save(task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id)
    {
        taskRepository.deleteById(id);
    }

}
