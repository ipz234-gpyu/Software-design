package com.education.ztu.Adapter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
    private PrintWriter writer;

    public MyFileWriter(String filename) throws IOException {
        this.writer = new PrintWriter(new FileWriter(filename, true));
    }

    public void Write(String message) {
        writer.print(message);
    }

    public void WriteLine(String message) {
        writer.println(message);
    }

    public void Close() {
        writer.close();
    }
}
