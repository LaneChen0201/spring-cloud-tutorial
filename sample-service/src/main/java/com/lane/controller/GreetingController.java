package com.lane.controller;

import com.lane.domain.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    private static String template = "Hello, %s!";

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody Greetings sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greetings(name, String.format(template, name));
    }

}
