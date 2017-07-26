package com.lane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/")
public class FilterChainController {

//    @Autowired
    private FilterChainProxy  filterChainProxy = new FilterChainProxy();

    @RequestMapping("/filterChain")
    public @ResponseBody Map<Integer, Map<Integer, String>> getSecurityFilterChainProxy(){
        return this.getFilterChain();
    }

    private Map<Integer, Map<Integer, String>> getFilterChain(){
        Map<Integer, Map<Integer, String>> filterChains= new HashMap<Integer, Map<Integer, String>>();
        int i = 1;
        for(SecurityFilterChain filterChain : filterChainProxy.getFilterChains()) {
            int j = 1;
            Map<Integer, String> filters = new HashMap<Integer, String>();
            for(Filter filter : filterChain.getFilters()){
                filters.put(j++, filter.getClass().getName());
            }
            filterChains.put(i++, filters);
        }
        return filterChains;
    }
}
