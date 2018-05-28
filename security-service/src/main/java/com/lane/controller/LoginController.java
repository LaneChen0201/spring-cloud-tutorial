package com.lane.controller;

import com.lane.entity.WrappedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Autowired
    private UserDetailsService userDetailsService;

    @RequestMapping("/auto-login")
    public WrappedResponse autoLogin(HttpServletRequest request) {
        // generate session if one doesn't exist
        request.getSession();

        // Authenticate the user
        UserDetails user = userDetailsService.loadUserByUsername("guest");
        Authentication auth = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(auth);
        return new WrappedResponse("autoLogin", "logged in as guest");
    }

}
