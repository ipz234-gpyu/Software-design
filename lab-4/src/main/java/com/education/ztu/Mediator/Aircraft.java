package com.education.ztu.Mediator;

public class Aircraft {
    private final String name;
    private boolean isTakingOff = false;
    private final CommandCentre commandCentre;

    public Aircraft(String name, CommandCentre commandCentre) {
        this.name = name;
        this.commandCentre = commandCentre;
    }

    public String getName() {
        return name;
    }

    public boolean isTakingOff() {
        return isTakingOff;
    }

    public void setTakingOff(boolean takingOff) {
        isTakingOff = takingOff;
    }

    public void land() {
        commandCentre.requestLanding(this);
    }

    public void takeOff() {
        commandCentre.requestTakeOff(this);
    }
}