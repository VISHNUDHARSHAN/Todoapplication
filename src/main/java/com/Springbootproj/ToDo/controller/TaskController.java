package com.Springbootproj.ToDo.controller;


import com.Springbootproj.ToDo.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

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
    public void createTask(@RequestBody Task task)
    {
        System.out.println(task.getDescription() + " - " + task.isCompleted());
    }
}
