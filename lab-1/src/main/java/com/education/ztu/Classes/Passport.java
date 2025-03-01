package com.education.ztu.Classes;

import com.education.ztu.Interfaces.Document;
import com.education.ztu.Interfaces.Identifiable;

public class Passport implements Document, Identifiable {
    private String name;
    private String photo;
    private String personalNumber;
    private String dateOfBirth;
    private String nationality;
    private String gender;
    private String expiryDate;
    private boolean isHidden;

    public Passport(String name, String photo, String personalNumber, String dateOfBirth, String nationality, String gender, String expiryDate) {
        this.name = name;
        this.photo = photo;
        this.personalNumber = personalNumber;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.gender = gender;
        this.expiryDate = expiryDate;
        this.isHidden = false;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getInfo() {
        return "Passport Information:\n" +
                "Name: " + name + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Nationality: " + nationality + "\n" +
                "Gender: " + gender + "\n" +
                "Personal Number: " + personalNumber + "\n" +
                "Expiry Date: " + expiryDate;
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
    public String generateQR() { return "QR-Passport: " + name; }

    @Override
    public String getPersonalNumber() { return personalNumber; }
}