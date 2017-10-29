package com.example.demo.service;

import com.example.demo.model.Exam;
import com.example.demo.repository.ExamRepository;
import com.example.demo.utils.EmailSenderUtil;
import com.example.demo.utils.SmsNotifierUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class RegularExamService implements ExamService {

  @Autowired
  private ApplicationEventPublisher publisher;

  @Autowired
  private ExamRepository examRepository;

  private void notifyBySms() {
    SmsNotifierUtil smsNotifierUtil = new SmsNotifierUtil();
    smsNotifierUtil.notifyBySms();
  }

  private void notifyByEmail() {
    EmailSenderUtil emailSenderUtil = new EmailSenderUtil();
    emailSenderUtil.send();
  }

  private void calculateCredits(Exam exam) {

  }

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

    publisher.publishEvent(new ExamGradedEvent(exam, failed));
  }
}
