package com.education.ztu.Singleton;

public class Authenticator {
    private static volatile Authenticator instance;

    private Authenticator() {
        System.out.println("Authenticator instance created");
    }

    public static Authenticator getInstance() {
        if (instance == null) {
            synchronized (Authenticator.class) {
                if (instance == null) {
                    instance = new Authenticator();
                }
            }
        }
        return instance;
    }

    public void authenticate(String username, String password) {
        System.out.println("Authenticating user: " + username);
    }
}

