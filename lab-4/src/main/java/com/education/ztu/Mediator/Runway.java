package com.education.ztu.Mediator;

import java.util.UUID;

public class Runway {
    private final String id = UUID.randomUUID().toString();
    private Aircraft busyWithAircraft = null;

    public boolean isAvailable() {
        return busyWithAircraft == null;
    }

    public void occupy(Aircraft aircraft) {
        busyWithAircraft = aircraft;
        highlightRed();
    }

    public void release() {
        busyWithAircraft = null;
        highlightGreen();
    }

    public void highlightRed() {
        System.out.println("Runway " + id + " is busy!");
    }

    public void highlightGreen() {
        System.out.println("Runway " + id + " is free!");
    }

    public String getId() {
        return id;
    }

    public Aircraft getBusyWithAircraft() {
        return busyWithAircraft;
    }
}