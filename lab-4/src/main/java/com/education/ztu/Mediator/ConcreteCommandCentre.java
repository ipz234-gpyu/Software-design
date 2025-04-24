package com.education.ztu.Mediator;

import java.util.List;

public class ConcreteCommandCentre implements CommandCentre {
    private final List<Runway> runways;

    public ConcreteCommandCentre(List<Runway> runways) {
        this.runways = runways;
    }

    @Override
    public void requestLanding(Aircraft aircraft) {
        System.out.println("Aircraft " + aircraft.getName() + " is requesting to land.");
        for (Runway runway : runways) {
            if (runway.isAvailable()) {
                System.out.println("Aircraft " + aircraft.getName() + " has landed on runway " + runway.getId());
                runway.occupy(aircraft);
                return;
            }
        }
        System.out.println("No available runways for landing.");
    }

    @Override
    public void requestTakeOff(Aircraft aircraft) {
        System.out.println("Aircraft " + aircraft.getName() + " is requesting to take off.");
        for (Runway runway : runways) {
            if (runway.getBusyWithAircraft() == aircraft) {
                aircraft.setTakingOff(true);
                runway.release();
                System.out.println("Aircraft " + aircraft.getName() + " has taken off from runway " + runway.getId());
                return;
            }
        }
        System.out.println("Aircraft " + aircraft.getName() + " is not on any runway.");
    }
}