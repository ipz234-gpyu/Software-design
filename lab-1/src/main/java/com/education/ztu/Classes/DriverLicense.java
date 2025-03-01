package com.education.ztu.Classes;

import com.education.ztu.Interfaces.Document;
import com.education.ztu.Interfaces.VehicleRegistrable;

public class DriverLicense implements Document, VehicleRegistrable {
    private String name;
    private String photo;
    private String licenseNumber;
    private boolean isHidden;

    public DriverLicense(String name, String photo, String licenseNumber) {
        this.name = name;
        this.photo = photo;
        this.licenseNumber = licenseNumber;
        this.isHidden = false;
    }

    @Override
    public String getName() { return name; }

    @Override
    public  String getInfo()
    {
        return "Driver license information:\n" +
                "Name: " + name + "\n" +
                "License number: " + licenseNumber;
    }

    @Override
    public String getPhoto() { return photo; }

    @Override
    public boolean isHidden() { return isHidden; }

    @Override
    public void hideInfo() { isHidden = true; }

    @Override
    public void showInfo() { isHidden = false; }

    @Override
    public String generateQR() { return "QR-DriverLicense: " + licenseNumber; }

    @Override
    public void registerCar() {
        System.out.println("Car registered for " + name);
    }
}