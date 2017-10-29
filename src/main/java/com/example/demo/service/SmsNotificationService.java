package com.example.demo.service;

import com.example.demo.model.Exam;

import org.springframework.context.event.EventListener;

public class SmsNotificationService {

  @EventListener
  public void handle(GradedEvent event) {
    Exam exam = event.getExam();
    System.out.println(exam);
  }
}
