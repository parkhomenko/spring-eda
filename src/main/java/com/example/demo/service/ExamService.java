package com.example.demo.service;

import com.example.demo.model.Exam;
import com.example.demo.repository.ExamRepository;
import com.example.demo.utils.EmailSenderUtil;
import com.example.demo.utils.SmsNotifierUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {

  @Autowired
  private ExamRepository examRepository;

  public void gradeStudent(Exam exam, boolean notification) {
    examRepository.save(exam);

    if (exam.getType().equals("exam") || exam.getType().equals("coursework")) {
      calculateCredits(exam);
    }

    if (notification) {
      notifyByEmail();
      notifyBySms();
    }
  }

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
}
