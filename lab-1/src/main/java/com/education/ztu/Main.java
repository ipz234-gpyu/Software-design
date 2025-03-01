package com.education.ztu;

import com.education.ztu.Classes.DocumentContainer;
import com.education.ztu.Classes.DriverLicense;
import com.education.ztu.Classes.MilitaryID;
import com.education.ztu.Classes.Passport;

public class Main {
    public static void main(String[] args) {
        DocumentContainer documentContainer = new DocumentContainer();

        Passport passport = new Passport("John Doe", "photo1.jpg", "123456789", "01/01/1990", "USA", "Male", "01/01/2030");
        DriverLicense driverLicense = new DriverLicense("John Doe", "photo2.jpg", "DL-987654");
        MilitaryID militaryID = new MilitaryID("John Doe", "photo3.jpg", "MIL-54321");

        System.out.println("\n📜 Unique opportunities:");
        System.out.println("Personal number: " + passport.getPersonalNumber());
        driverLicense.registerCar();

        documentContainer.addDocument(passport);
        documentContainer.addDocument(driverLicense);
        documentContainer.addDocument(militaryID);

        System.out.println("\n📜 All documents in the container:");
        documentContainer.displayDocuments();

        System.out.println("\n🔍 Passport search:");
        documentContainer.displayDocumentByType(Passport.class);

        System.out.println("\n📲 QR generation for driver's license:");
        documentContainer.generateQRDocumentByType(DriverLicense.class);

        System.out.println("\n👁️ Hide a passport...");
        documentContainer.toggleDocumentVisibility(Passport.class, false);
        System.out.println("\n📜 All documents after hiding a passport:");
        documentContainer.displayDocuments();

        System.out.println("\n👁️ Showing a passport...");
        documentContainer.toggleDocumentVisibility(Passport.class, true);
        System.out.println("\n📜 All documents after passport visibility is restored:");
        documentContainer.displayDocuments();

        System.out.println("\n📜 All documents after the document swap:");
        documentContainer.swapDocuments(1,2);
        documentContainer.displayDocuments();

        System.out.println("\n🗑️ Removing a military ID...");
        documentContainer.removeDocument(militaryID);

        System.out.println("\n📜 All documents after removal of a military ID card:");
        documentContainer.displayDocuments();
    }
}