package com.education.ztu.Proxy;

public class SmartTextChecker implements TextReader {
    private final TextReader reader;

    public SmartTextChecker(TextReader reader) {
        this.reader = reader;
    }

    @Override
    public char[][] readTextFile(String path) {
        System.out.println("Opening file: " + path);
        char[][] result = reader.readTextFile(path);
        System.out.println("Reading successful.");
        System.out.println("Lines: " + result.length);

        int totalChars = 0;
        for (char[] line : result) {
            totalChars += line.length;
        }

        System.out.println("Characters: " + totalChars);
        System.out.println("Closing file: " + path);
        return result;
    }
}