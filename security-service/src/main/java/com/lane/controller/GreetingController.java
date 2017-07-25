package com.lane.controller;

import com.lane.entity.WrappedResponse;
import org.hibernate.service.spi.Wrapped;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/")
public class GreetingController {

    @RequestMapping("greeting")
    public String greeting() {
        return "greeting";
    }

    @RequestMapping("rest-greeting")
    public @ResponseBody WrappedResponse restGreeting() {
        User loggedInUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return new WrappedResponse("rest-greeting", "hello, " + loggedInUser.getUsername() + "!");
    }
}
