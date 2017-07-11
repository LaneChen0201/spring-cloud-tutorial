package com.lane.controller;

import com.lane.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @RequestMapping(value = "/feign-say-greeting", method = RequestMethod.GET)
    public String sayGreeting(@RequestParam(value="name", required=false) String name) {
        return greetingService.sayGreeting(name);
    }

}
