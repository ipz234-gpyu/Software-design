package com.education.ztu.AbstractFactory;

import com.education.ztu.AbstractFactory.Factory.*;
import com.education.ztu.AbstractFactory.Product.*;

public class TestAbstractFactory {
    public static void main(String[] args) {
        DeviceFactory iProneFactory = new IPhoneFactory();
        DeviceFactory kiaomiFactory = new KiaomiFactory();
        DeviceFactory balaxyFactory = new BalaxyFactory();

        Smartphone iPronePhone = iProneFactory.createSmartphone();
        Laptop kiaomiLaptop = kiaomiFactory.createLaptop();
        Netbook balaxyNetbook = balaxyFactory.createNetbook();

        System.out.println(iPronePhone.getModel());
        System.out.println(kiaomiLaptop.getModel());
        System.out.println(balaxyNetbook.getModel());
    }
}
