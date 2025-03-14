package com.education.ztu.AbstractFactory.Factory;

import com.education.ztu.AbstractFactory.Product.Laptop;
import com.education.ztu.AbstractFactory.Product.Netbook;
import com.education.ztu.AbstractFactory.Product.Smartphone;

public interface DeviceFactory {
    Smartphone createSmartphone();
    Laptop createLaptop();
    Netbook createNetbook();
}
