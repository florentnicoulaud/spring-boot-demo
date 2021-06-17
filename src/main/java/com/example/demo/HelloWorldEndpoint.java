package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldEndpoint {


  private static final String template = "Hello, %s!";

  @GetMapping
  public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format(template, name);
  }
}
