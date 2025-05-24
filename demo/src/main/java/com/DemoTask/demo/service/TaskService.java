package com.DemoTask.demo.service;

import com.DemoTask.demo.entity.TaskEntry;
import com.DemoTask.demo.entity.TaskStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    private Map<Long,TaskEntry> taskEntries = new HashMap<>() ;
    private long taskIdCounter = 1;

    public TaskEntry createTask(TaskEntry input){
        long id = taskIdCounter++;
        TaskEntry task = new TaskEntry(id, input.getTitle(), input.getDescription());
        taskEntries.put(id,task);
        return task;
    }
    public List<TaskEntry> getAll(){
        return new ArrayList<>(taskEntries.values());
    }

    public void updateTaskStatuses() {
        for(TaskEntry task : taskEntries.values()) {
            switch (task.getStatus()) {
                case Pending:
                    task.setStatus(TaskStatus.In_Progress);
                    task.setUpdatedAt(LocalDateTime.now());
                    break;
                case In_Progress:
                    task.setStatus(TaskStatus.Review);
                    task.setUpdatedAt(LocalDateTime.now());
                    break;
                case Review:
                    task.setStatus(TaskStatus.Completed);
                    task.setUpdatedAt(LocalDateTime.now());
                    break;
                case Completed:
                    break;
            }
        }
    }
}
