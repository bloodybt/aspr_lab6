package com.example.lab6;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class TaskService {

    @Scheduled(cron = "0 0 10 * * ?")
    public void executeDailyTask() {
        System.out.println("Завдання виконано о 10:00");
    }

    @Scheduled(initialDelay = 2000, fixedRate = 3000)
    public void executeTaskEvery3Seconds() {
        System.out.println("Завдання виконується кожні 3 секунди");
    }
}
