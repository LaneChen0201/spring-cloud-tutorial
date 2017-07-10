package com.lane.controller;

import com.lane.domain.Greetings;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@Controller
@RequestMapping("/greeting")
public class GreetingController {
    private final Logger logger = Logger.getLogger(getClass());

    private static String template = "Hello, %s!";

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(method= RequestMethod.GET)

    public @ResponseBody Greetings sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/greeting, host:" + instance.getHost() + "， port:" + instance.getPort() + ", service_id:" + instance.getServiceId());
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Greetings(name, String.format(template, name));
    }

}
