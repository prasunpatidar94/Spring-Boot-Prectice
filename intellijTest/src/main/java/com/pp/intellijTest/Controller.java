package com.pp.intellijTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hi")
    public String hello(){

        return "hello Prasun patidar";
    }
}
