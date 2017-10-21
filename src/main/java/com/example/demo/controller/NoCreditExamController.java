package com.example.demo.controller;

import com.example.demo.model.Exam;
import com.example.demo.service.ExamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoCreditExamController {

  @Autowired
  private ExamService examService;

  @RequestMapping(value = "/grade/optional", method = RequestMethod.POST)
  public void gradeStudent(@RequestBody Exam exam) {
    examService.gradeStudent(exam, false);
  }
}
