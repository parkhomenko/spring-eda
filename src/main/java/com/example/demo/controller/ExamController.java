package com.example.demo.controller;


import com.example.demo.model.Exam;
import com.example.demo.service.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

  @Autowired
  @Qualifier("regularExamService")
  private ExamService examService;

  @RequestMapping(value = "/grade/exam", method = RequestMethod.POST)
  public void gradeExam(@RequestBody Exam exam) {
    examService.gradeStudent(exam);
  }
}
