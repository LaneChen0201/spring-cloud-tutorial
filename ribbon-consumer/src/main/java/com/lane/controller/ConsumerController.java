package com.lane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/call-greeting-service", method = RequestMethod.GET)
    public String callGreetingService(@RequestParam(value="name", required=false) String name) {
        return restTemplate.getForEntity("http://SAMPLE-SERVICE/greeting?name=" + name, String.class).getBody();
    }
}
