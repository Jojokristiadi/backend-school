package com.school.smp1.controllers;

import com.school.smp1.models.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        Greeting hello = new Greeting(1, "Hello World All");
        return hello;
    }
}