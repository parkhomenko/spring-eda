package com.example.demo.service;

import com.example.demo.model.Exam;

public class GradedEvent {

  private Exam exam;
  private boolean failedExam;

  public GradedEvent(Exam exam, boolean failedExam) {
    this.exam = exam;
    this.failedExam = failedExam;
  }

  public Exam getExam() {
    return exam;
  }

  public boolean isFailedExam() {
    return failedExam;
  }
}
