package com.example.ai.stock.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

  @GetMapping("/hi")
  public String sayHi() {
    System.out.println("HELLO");
    return "HELLO";
  }
}
