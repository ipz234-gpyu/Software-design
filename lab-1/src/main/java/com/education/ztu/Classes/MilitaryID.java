package com.education.ztu.Classes;

import com.education.ztu.Interfaces.Document;

public class MilitaryID implements Document {
    private String name;
    private String photo;
    private String militaryCode;
    private boolean isHidden;

    public MilitaryID(String name, String photo, String militaryCode) {
        this.name = name;
        this.photo = photo;
        this.militaryCode = militaryCode;
        this.isHidden = false;
    }

    @Override
    public String getName() { return name; }

    @Override
    public  String getInfo()
    {
        return "Military information:\n" +
                "Name: " + name + "\n" +
                "Military code: " + militaryCode;
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
    public String generateQR() { return "QR-MilitaryID: " + militaryCode; }
}
