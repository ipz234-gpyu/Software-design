package com.education.ztu.Adapter;

import java.io.IOException;

public class FileLoggerAdapter implements ILogger {
    private MyFileWriter fileWriter;
    private ILogger consoleLogger;

    public FileLoggerAdapter(String filename) throws IOException {
        this.fileWriter = new MyFileWriter(filename);
        this.consoleLogger = new ConsoleLogger();
    }

    @Override
    public void Log(String message) {
        consoleLogger.Log(message);
        fileWriter.WriteLine("LOG: " + message);
    }

    @Override
    public void Error(String message) {
        consoleLogger.Error(message);
        fileWriter.WriteLine("ERROR: " + message);
    }

    @Override
    public void Warn(String message) {
        consoleLogger.Warn(message);
        fileWriter.WriteLine("WARNING: " + message);
    }

    public void close() {
        fileWriter.Close();
    }
}