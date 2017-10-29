package com.example.demo.service;

public interface Consumer<T> {

  void handle(T event);
}
