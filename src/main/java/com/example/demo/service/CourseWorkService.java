package com.example.demo.service;

import com.example.demo.model.Exam;
import com.example.demo.repository.ExamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CourseWorkService implements ExamService {

  @Autowired
  private ApplicationEventPublisher publisher;

  @Autowired
  private ExamRepository examRepository;

  @Override
  public void gradeStudent(Exam exam) {
    examRepository.save(exam);
    /*calculateCredits(exam);
    notifyByEmail();
    notifyBySms();*/

    boolean failed = false;
    if (exam.getGrade() == 2) {
      failed = true;
    }

    publisher.publishEvent(new CourseWorkGradedEvent(exam, failed));
  }

  private void notifyBySms() {

  }

  private void notifyByEmail() {

  }

  private void calculateCredits(Exam exam) {

  }
}
