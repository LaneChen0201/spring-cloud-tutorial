package com.lane.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;

@Service
public class GreetingService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayGreetingFallback")
    public String sayGreeting(String name) throws URISyntaxException {
        return restTemplate.getForEntity("http://SAMPLE-SERVICE/greeting?name=" + name, String.class).getBody();
    }

    public String sayGreetingFallback(String name) {
        return "error happend when say greeting to " + name;
    }
}
