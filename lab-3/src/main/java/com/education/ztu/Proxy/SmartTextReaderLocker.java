package com.education.ztu.Proxy;

import java.util.regex.Pattern;

public class SmartTextReaderLocker implements TextReader {
    private final TextReader reader;
    private final Pattern blockedPattern;

    public SmartTextReaderLocker(TextReader reader, String regex) {
        this.reader = reader;
        this.blockedPattern = Pattern.compile(regex);
    }

    @Override
    public char[][] readTextFile(String path) {
        if (blockedPattern.matcher(path).matches()) {
            System.out.println("Access denied!");
            return new char[0][];
        }
        return reader.readTextFile(path);
    }
}