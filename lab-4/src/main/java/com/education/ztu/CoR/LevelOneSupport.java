package com.education.ztu.CoR;

import java.util.Scanner;

class LevelOneSupport extends SupportHandler {
    @Override
    public boolean handleRequest() {
        System.out.println("Ви бажаєте дізнатися баланс чи тариф? (так/ні)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("так")) {
            System.out.println("Вас з'єднано з підтримкою рівня 1.");
            return true;
        } else if (next != null) {
            return next.handleRequest();
        }
        return false;
    }
}