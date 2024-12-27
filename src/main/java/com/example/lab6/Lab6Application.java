package com.example.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Lab6Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab6Application.class, args);
		System.out.println(LocalDateTime.now() + " | PROGRAM START");
	}

	@Scheduled(cron = "0 0 10 * * ?")
	public void executeDailyTask() {
		System.out.println(LocalDateTime.now() + " | Завдання виконано о 10:00");
	}


	@Scheduled(initialDelay = 2000, fixedRate = 3000)
	public void executeTaskEvery3Seconds() {
		System.out.println(LocalDateTime.now() + " | Завдання виконується кожні 3 секунди");
	}

}
