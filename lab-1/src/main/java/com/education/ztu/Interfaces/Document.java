package com.education.ztu.Interfaces;

public interface Document {
    String getName();
    String getInfo();
    String getPhoto();
    boolean isHidden();
    void hideInfo();
    void showInfo();
    String generateQR();
}