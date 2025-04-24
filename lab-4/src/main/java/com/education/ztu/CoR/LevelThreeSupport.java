package com.education.ztu.CoR;

import java.util.Scanner;

class LevelThreeSupport extends SupportHandler {
    @Override
    public boolean handleRequest() {
        System.out.println("У вас виникла проблема з оплатою? (так/ні)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("так")) {
            System.out.println("Вас з'єднано з підтримкою рівня 3.");
            return true;
        } else if (next != null) {
            return next.handleRequest();
        }
        return false;
    }
}