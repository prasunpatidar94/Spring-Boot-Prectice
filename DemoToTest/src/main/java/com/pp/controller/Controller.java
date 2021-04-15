package com.pp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/pp")
@RestController
public class Controller {

    @GetMapping("/hello")
    public  String hi (){return "This is Prasun Patidar";}
}
