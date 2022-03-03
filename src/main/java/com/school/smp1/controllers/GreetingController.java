package com.school.smp1.controllers;

import com.school.smp1.models.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greetings")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String custom) {
        Greeting hello = new Greeting(1, "Hello " + custom);
        return hello;
    }
    
}