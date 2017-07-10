package com.lane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerRibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-greeting", method = RequestMethod.GET)
    public String sayGreeting(@RequestParam(value="name", required=false) String name) {
        return restTemplate.getForEntity("http://SAMPLE-SERVICE/greeting?name=" + name, String.class).getBody();
    }
}
