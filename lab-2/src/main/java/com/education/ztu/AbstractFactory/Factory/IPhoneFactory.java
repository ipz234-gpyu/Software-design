package com.education.ztu.AbstractFactory.Factory;

import com.education.ztu.AbstractFactory.Product.*;

public class IPhoneFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new IProneSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new IProneLaptop();
    }

    @Override
    public Netbook createNetbook() {
        return new IProneNetbook();
    }
}

