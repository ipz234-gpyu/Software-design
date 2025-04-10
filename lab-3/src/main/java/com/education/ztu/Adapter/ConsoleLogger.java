package com.education.ztu.Adapter;

public class ConsoleLogger implements ILogger {
    public void Log(String message) {
        System.out.println("\u001B[32m" + message);
    }

    public void Error(String message) {
        System.out.println("\u001B[31m" + message);
    }

    public void Warn(String message) {
        System.out.println("\u001B[33m" + message);
    }
}
