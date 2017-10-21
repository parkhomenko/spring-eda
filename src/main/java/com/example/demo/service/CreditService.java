package com.example.demo.service;

import com.example.demo.model.Exam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditService {

  Logger logger = LoggerFactory.getLogger(CreditService.class);

  public void calculate(Exam exam) {
    logger.info("Some cridits calculation goes here");
  }
}
