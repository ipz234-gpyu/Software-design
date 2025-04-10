package com.education.ztu.Proxy;

import java.io.*;
import java.util.*;

public class SmartTextReader implements TextReader {

    @Override
    public char[][] readTextFile(String path) {
        List<char[]> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.toCharArray());
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + path, e);
        }

        return lines.toArray(new char[0][]);
    }
}