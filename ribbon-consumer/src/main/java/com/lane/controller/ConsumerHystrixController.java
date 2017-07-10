package com.lane.controller;

import com.lane.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class ConsumerHystrixController {
    @Autowired
    GreetingService greetingService;

    @RequestMapping(value="/hystrix-greeting", method = RequestMethod.GET)
    public String sayGreeting(@RequestParam(value="name", required=false) String name) throws URISyntaxException {
        return greetingService.sayGreeting(name);
    }
}
