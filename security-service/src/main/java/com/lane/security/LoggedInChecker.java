package com.lane.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class LoggedInChecker {
    public User getLoggedInUser() {
        User user = null;

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            return (User) authentication.getPrincipal();
        }

        return user;
    }
}
