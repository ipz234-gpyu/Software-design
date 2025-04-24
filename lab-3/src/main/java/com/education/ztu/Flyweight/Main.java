package com.education.ztu.Flyweight;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("book.txt");
        if (inputStream == null) {
            System.out.println("File not found: book.txt");
            return;
        }

        String bookText = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        // Без Flyweight
        long beforeMemory = getUsedMemory();
        LightElementNode rootWithoutFlyweight = new LightElementNode(
                new LightElementNodeType("div", LightElementNodeType.DisplayType.BLOCK, LightElementNodeType.ClosingType.PAIR)
        );

        for (String paragraph : bookText.split("\n")) {
            LightElementNode p = new LightElementNode(
                    new LightElementNodeType("p", LightElementNodeType.DisplayType.BLOCK, LightElementNodeType.ClosingType.PAIR)
            );
            p.appendChild(new LightTextNode(paragraph));
            rootWithoutFlyweight.appendChild(p);
        }

        long afterMemory = getUsedMemory();
        System.out.println("Без Flyweight: приблизно " + (afterMemory - beforeMemory) / 1024 + " KB");

        // З Flyweight через BookParser
        BookParser bookParser = new BookParser();
        long beforeMemoryWithFlyweight = getUsedMemory();
        LightElementNode rootWithFlyweight = bookParser.parseText(bookText);
        long afterMemoryWithFlyweight = getUsedMemory();
        System.out.println("З Flyweight: приблизно " + (afterMemoryWithFlyweight - beforeMemoryWithFlyweight) / 1024 + " KB");
    }

    private static long getUsedMemory() {
        System.gc();
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}