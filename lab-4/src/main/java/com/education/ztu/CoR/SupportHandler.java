package com.education.ztu.CoR;

abstract class SupportHandler {
    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract boolean handleRequest();
}