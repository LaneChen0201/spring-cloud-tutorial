package com.lane.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("SAMPLE-SERVICE")
public interface GreetingService {

    @RequestMapping("/greeting")
    String sayGreeting(@RequestParam("name") String name);

}
