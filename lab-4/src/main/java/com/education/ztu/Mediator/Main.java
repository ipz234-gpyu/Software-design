package com.education.ztu.Mediator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Runway r1 = new Runway();
        Runway r2 = new Runway();

        ConcreteCommandCentre centre = new ConcreteCommandCentre(Arrays.asList(r1, r2));

        Aircraft a1 = new Aircraft("Boeing 737", centre);
        Aircraft a2 = new Aircraft("Airbus A320", centre);

        a1.land();   // має зайняти одну з двох смуг
        a2.land();   // має зайняти другу
        a1.takeOff(); // має звільнити смугу
        a2.takeOff(); // звільнити іншу
        a1.land();    // знову посадка
    }
}