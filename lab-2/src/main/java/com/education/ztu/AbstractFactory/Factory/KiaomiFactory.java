package com.education.ztu.AbstractFactory.Factory;

import com.education.ztu.AbstractFactory.Product.*;

public class KiaomiFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new KiaomiSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new KiaomiLaptop();
    }

    @Override
    public Netbook createNetbook() {
        return new KiaomiNetbook();
    }
}
