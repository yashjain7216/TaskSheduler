package com.DemoTask.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskShedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskShedulerApplication.class, args);
	}

}
