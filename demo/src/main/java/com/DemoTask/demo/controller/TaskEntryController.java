package com.DemoTask.demo.controller;

import com.DemoTask.demo.entity.TaskEntry;
import com.DemoTask.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskEntryController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<TaskEntry> tasks = taskService.getAll();
        if (tasks.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body("No entries found");
        }
        return ResponseEntity.ok(tasks);
    }

    @PostMapping
    public void createTask(@RequestBody TaskEntry task){
        taskService.createTask(task);
    }


}
