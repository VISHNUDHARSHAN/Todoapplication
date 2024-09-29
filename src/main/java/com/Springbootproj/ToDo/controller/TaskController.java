package com.Springbootproj.ToDo.controller;


import com.Springbootproj.ToDo.Repository.TaskRepository;
import com.Springbootproj.ToDo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
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

    @PostMapping("/api/tasks")
    public Task createTask(@RequestBody Task task)
    {
        System.out.println(task.getDescription() + " - " + task.isCompleted());
        taskRepository.save(task);
        System.out.println(task.getDescription() + " - " + task.isCompleted());
        return task;

    }
}
