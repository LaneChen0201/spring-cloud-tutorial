package com.lane.domain;

public class Greetings {
    private String name;
    private String greeting;

    public Greetings(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
