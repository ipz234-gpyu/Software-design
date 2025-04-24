package com.education.ztu.Mediator;

public interface CommandCentre {
    void requestLanding(Aircraft aircraft);
    void requestTakeOff(Aircraft aircraft);
}