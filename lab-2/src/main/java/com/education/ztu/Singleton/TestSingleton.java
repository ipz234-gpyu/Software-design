package com.education.ztu.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                Authenticator auth = Authenticator.getInstance();
                System.out.println(auth);
            });
        }

        executor.shutdown();
    }
}
