package com.example.demo.service;

import com.example.demo.model.Exam;

public class CourseWorkGradedEvent extends GradedEvent {

  public CourseWorkGradedEvent(Exam exam, boolean failedExam) {
    super(exam, failedExam);
  }

}
