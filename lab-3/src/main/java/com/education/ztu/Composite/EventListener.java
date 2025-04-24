package com.education.ztu.Composite;

public interface EventListener {
    void handleEvent(String eventType, LightElementNode source);
}