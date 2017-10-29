package com.example.demo.service;

import com.example.demo.model.Exam;
import com.example.demo.repository.ExamRepository;
import com.example.demo.utils.EmailSenderUtil;
import com.example.demo.utils.SmsNotifierUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ExamService {

  void gradeStudent(Exam exam);

}
