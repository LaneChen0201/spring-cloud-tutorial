package com.lane.entity;

public class WrappedResponse {
    private String name;
    private String desc;

    public WrappedResponse(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
