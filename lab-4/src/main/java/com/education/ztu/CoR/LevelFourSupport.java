package com.education.ztu.CoR;

import java.util.Scanner;

class LevelFourSupport extends SupportHandler {
    @Override
    public boolean handleRequest() {
        System.out.println("Чи є у вас інше питання, яке не стосується вище перелічених? (так/ні)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("так")) {
            System.out.println("Вас з'єднано з підтримкою рівня 4.");
            return true;
        } else {
            System.out.println("Не вдалося визначити тип запиту. Спробуйте ще раз.\n");
            return false;
        }
    }
}