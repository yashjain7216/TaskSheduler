package com.DemoTask.demo.sheduler;

import com.DemoTask.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskSheduler {

    @Autowired
    private TaskService taskService;

    @Scheduled(fixedRate = 21600000)
    public void updateStatuses() {
        taskService.updateTaskStatuses();
    }
}
