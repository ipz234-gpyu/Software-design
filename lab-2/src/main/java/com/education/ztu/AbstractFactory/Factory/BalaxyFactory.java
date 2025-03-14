package com.education.ztu.AbstractFactory.Factory;

import com.education.ztu.AbstractFactory.Product.*;

public class BalaxyFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new BalaxySmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new BalaxyLaptop();
    }

    @Override
    public Netbook createNetbook() {
        return new BalaxyNetbook();
    }
}
