package com.example.demo.service;

import com.example.demo.model.Exam;

import org.springframework.context.ApplicationEvent;

public class NoCreditGradedEvent extends GradedEvent {

  public NoCreditGradedEvent(Exam exam, boolean failedExam) {
    super(exam, failedExam);
  }

}
