package com.example.demo.service;

import com.example.demo.model.Exam;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService {

  @Async
  @EventListener
  public void handleRegularExam(ExamGradedEvent event) {
    Exam exam = event.getExam();
    System.out.println(exam);
  }

  @EventListener
  public void handleCourseWork(CourseWorkGradedEvent event) {
    Exam exam = event.getExam();
    System.out.println(exam);
  }

  @EventListener
  public void handleNoCreditExam(NoCreditGradedEvent event) {
    Exam exam = event.getExam();
    System.out.println(exam);
  }

  @EventListener(condition = "#event.failedExam")
  public void handleFailedRegularExam(ExamGradedEvent event) {
    Exam exam = event.getExam();
    System.out.println(exam);
  }
}
