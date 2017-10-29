package com.example.demo.service;

import com.example.demo.model.Exam;

public class ExamGradedEvent extends GradedEvent {

  public ExamGradedEvent(Exam exam, boolean failedExam) {
    super(exam, failedExam);
  }

}
