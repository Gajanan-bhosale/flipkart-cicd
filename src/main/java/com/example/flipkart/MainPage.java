package com.example.flipkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPage {

    @GetMapping("/MainPage")
    public String getData(){
        return "Please book your flight at 10% discount";
    }
}
