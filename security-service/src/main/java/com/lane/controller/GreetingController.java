package com.lane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GreetingController {

    @RequestMapping("greeting")
    public String greeting() {
        return "greeting";
    }
}
