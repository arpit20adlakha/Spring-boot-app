package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    public TaskController() {
    }

    @PostMapping(path= "/tasks")
    public void addTask(@RequestBody Task task) {
        tasks.add(task);
        System.out.println(task.getName());
        System.out.println(task.getDescription());
    }

    @GetMapping(path= "/tasks/{id}")
    public Task getLine(@PathVariable int id, @RequestParam int c) {
       return tasks.get(id - 1);
    }
}
